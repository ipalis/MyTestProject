import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Map;
import java.io.IOException;
import jxl.Workbook;  
import jxl.write.Label;
import jxl.write.Number;  
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import java.util.Date;


public class TestProcessor extends BaseProcessor {

	String folderPath;
	ArrayList<TestRunner> myTestList;
	LinkedHashMap<String, Result> myMapResults;
	
	public TestProcessor(String path) {
		this.folderPath = path;
		this.myTestList = new ArrayList<TestRunner>();
		this.myMapResults = new LinkedHashMap<String, Result>();
		super.getConnection();
	}

	// method which execute all tests
	public void executeAllTests() {
		if (hasConnection) {
			for (int i = 0; i < myTestList.size(); i++) {
				TestRunner test = myTestList.get(i);
				if (!test.getIsValid()) {
					String name = (test.getName() == null) ? test.getTestPath() : test.getName();
					myMapResults.put(name, Result.INVALID);
				} else {
					test.runTest(connection);
					boolean res = test.getResult();
					myMapResults.put(test.getName(), res ? Result.PASSED : Result.FAILED);
				}
			}
		}
	}
	
	//method which parse tests
	public void parseTest() {
		File folder = new File(folderPath);
		for (final File fileEntry : folder.listFiles()) {
			if (fileEntry.isFile()) {
				myTestList.add(new BaseTest(fileEntry.getAbsolutePath()));
			}
		}
	}
	
	// method which generate xls-file with test results
	public void generateReport() throws IOException, RowsExceededException, WriteException{
		WritableWorkbook myWorkbook;
		DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm");
		Date date = new Date();
		myWorkbook= Workbook.createWorkbook(new File(dateFormat.format(date) + "_Report.xls"));  
		WritableSheet mySheet = myWorkbook.createSheet("First Sheet", 0);  
		Label label1 = new Label(0, 0, "Number");  
		Label label2 = new Label(1, 0, "Test case name");  
		Label label3 = new Label(2, 0, "Result");  
		mySheet.addCell(label1);
		mySheet.addCell(label2);
		mySheet.addCell(label3);
		int i = 0;
		for (Map.Entry<String, Result> entry : myMapResults.entrySet())
		{
			i++;
		   Number number = new Number(0,i, i);
		   Label labelKey = new Label(1,i, entry.getKey());
		   Label labelValue = new Label(2,i, entry.getValue().toString());
		   mySheet.addCell(labelKey);
		   mySheet.addCell(labelValue);
		   mySheet.addCell(number);
		}
	
		myWorkbook.write();
		myWorkbook.close();

	}

	
}