import java.io.IOException;
import java.sql.Connection;

public interface TestRunner {
	
	public void runTest(Connection connection);
	public void readFromFile() throws IOException;
	public boolean getIsValid();
	public String getName();
	public boolean getResult();
	public String getTestPath();
	
}