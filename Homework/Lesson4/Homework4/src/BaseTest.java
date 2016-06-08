import java.io.*;
import java.sql.*;
import java.util.HashSet;
import java.util.Set;
 
public class BaseTest implements TestRunner {
	
	public int id;
	//this is fields in test case files
	public String name, type, query, filePath, expectedResult;

	boolean isValid, result;
	
	
	public BaseTest(String filePath) {
		this.filePath = filePath;
		isValid = false;
		try{
		readFromFile();
		}
		catch(IOException e){
			System.out.println("File: " + filePath + e.getLocalizedMessage());
		}
	}
	
	
	// Read from file with parsing atribute and his value
	public  void readFromFile() throws IOException {
		// Specify path to your file
		File file = new File(filePath);

		// Create special input stream for reading data
		FileInputStream fis = new FileInputStream(file);

		//Construct BufferedReader from InputStreamReader
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));

		// Print all existing lines from file to the console
		String line = null;
		int i=0;
		while ((line = br.readLine()) != null) {  
			String name = readAtributeNames(line);
			
			if (name == null){
				throw new IOException("Line does not have atribute name, test is invalid! Line number" + i + "Filepath" + filePath);
			}
			i++;
			switch(name){
	            case "id":  			this.id = getId(line);
	                     				break;
	            case "name":  			this.name = getValue(line);
	                     				break;
	            case "type": 			this.type = getValue(line);
										break;
	            case "query": 			this.query = getQuery(line);
	            						break;
	            case "expectedResult": 
	            	
						            	if (type.equals("SimpleScenarios")){
						            		this.expectedResult = getValue(line);
						            	}
						            	if(type.equals("ComplexScenarios")){
						            		this.expectedResult = getQuery(line);
						            	}
	            	
	            						break;
	            default: isValid = false;
			}
			
		}
		isValid = true;
		br.close();
		}
	
	// method which start tests
	public void runTest(Connection connection) {
		
		boolean iSValid = false;
		ResultSet sqlResult = null;
		System.out.println("Run test case: " + filePath);
		
		// Execute a query
		try{
			System.out.println("Creating statement... for: " + filePath);
			Statement statement = connection.createStatement();
			sqlResult = statement.executeQuery(query);
			iSValid = true;
		}
		catch(SQLException se){
			
		      //Handle errors for JDBC
		      se.printStackTrace();
		}catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		}
		finally {
			isValid = iSValid;			
		}
		
		try {
			switch (type) {
			case "SimpleScenarios":
				compareWithExpectedResultSimpleScenarios(sqlResult);
				break;
			case "ComplexScenarios":
				compareWithExpectedResultComplexScenarios(sqlResult);
				break;
			default:
				break;
			}

		} catch (SQLException e) {
			iSValid = false;
		}
		finally {
			isValid = iSValid;
		}
		
	}
	
	public boolean checkTestStatus(){
		return result;
	}
	
	public boolean getIsValid() {
		return isValid;
	}

	public String getName() {
		return name;
	}

	public boolean getResult() {
		return result;
	}
	
	public String getTestPath() {
		return filePath; 
	}
	
	
	
	// get atributes names
	private String readAtributeNames(String line) {
		if (line.contains(":")){
			return line.substring(0,line.indexOf(":"));
		}
		else {
			return null;
		}
	}
	
	// get id from test case
	private int getId(String line){
		int begin = line.indexOf(":")+1;
		while(line.charAt(begin) == ' '){
			begin++;
		}
		String s =line.substring(begin, line.indexOf(";"));
		int foo = Integer.parseInt(s.trim());
		return foo; 
	}
	
	
	private String getValue(String line){
		int begin = line.indexOf(":")+1;
		while(line.charAt(begin) == ' '){
			begin++;
		}
		return line.substring(begin, line.indexOf(";")); 
	}
	
	//get query from test case
	private String getQuery(String line){
		int begin = line.indexOf(":")+1;
		while(line.charAt(begin) == ' '){
			begin++;
		}
		return line.substring(begin); 
	}
	
	// compare results for simple scenarios
	private void compareWithExpectedResultSimpleScenarios(ResultSet compareResult) throws SQLException{
		if(!compareResult.isBeforeFirst()){
		result = false;
		return;
		}
		else {
		compareResult.next();
		String currentResult = compareResult.getString(1);
		result = currentResult.equals(expectedResult.trim());
		}
	}
	
	
	// compare results for complex scenarios
	private void compareWithExpectedResultComplexScenarios(ResultSet compareResult) throws SQLException{
		result = false;
		if(!compareResult.isBeforeFirst()){
		
		return;
		}			
		else {
			
			Set<String> setExpResults = parseExpectedResultsToSet();
			Set<String> setResults = new HashSet<String>();
			while(compareResult.next()){

				setResults.add((compareResult.getString(1) == null) ? "null":compareResult.getString(1));
			}
			if(setExpResults.equals(setResults)){
				result = true;
			}
			
		}
	}
	
	// parese expected result to set
		private Set<String> parseExpectedResultsToSet() {
			Set<String> setExpResults = new HashSet<String>();
			if(!expectedResult.isEmpty() && (expectedResult.indexOf(";") != -1)){
				
				int begin = 0;
				
				while(begin < expectedResult.length()){
					while(expectedResult.charAt(begin) == ' '){
						begin++;
					}
					if(expectedResult.indexOf(",", begin) != -1){
							setExpResults.add(expectedResult.substring(begin, expectedResult.indexOf(",", begin)));
							begin = expectedResult.indexOf(",", begin) + 1;
					}
					else {
						setExpResults.add(expectedResult.substring(begin, expectedResult.indexOf(";", begin)));
						begin = expectedResult.length();
					}
				}
			}
			return setExpResults;
		}
}

