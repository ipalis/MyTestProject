import java.io.*;
import java.sql.SQLException;

public class Main {


	public static void main(String[] args) throws SQLException {
		
		Processor createDb = new TestProcessor("");
		
		createDb.createDataBase();
		createDb.createTableAirlines();
		createDb.createTableAirports();
		createDb.createTableFlights();
		createDb.fillAirlinesTable();
		createDb.fillAirportTable();
		createDb.fillFlightsTable();
		
		File file = new File("Test Cases");	
		
		if (file.exists() && file.isDirectory()){
			try {
				Processor testProc = new TestProcessor("Test Cases");
				
				testProc.parseTest();
				testProc.executeAllTests();
				testProc.generateReport();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		else{
			System.out.println("Path is not valid!");
		}
		
	}
}