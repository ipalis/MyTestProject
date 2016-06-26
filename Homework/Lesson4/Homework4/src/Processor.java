import java.io.IOException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public interface Processor {
	
	public void createDataBase();
	public void createTableAirlines();
	public void createTableAirports();
	public void createTableFlights();
	public void fillAirlinesTable();
	public void fillAirportTable();
	public void fillFlightsTable();
	public void executeAllTests();
	public void parseTest();
	public void generateReport() throws IOException, RowsExceededException, WriteException;

}