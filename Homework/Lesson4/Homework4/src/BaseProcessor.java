import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class BaseProcessor implements Processor {

	protected Connection connection;
	protected boolean hasConnection;
	
		
		//method which create database
		public void createDataBase() {
			
			// JDBC driver name and database URL
			   final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
			   final String DB_URL = "jdbc:mysql://localhost/";

			   //  Database credentials
			   final String USER = "root";
			   final String PASS = "root";
			   
			   Connection conn = null;
			   Statement stmt = null;
			   
			   try{
			      //STEP 2: Register JDBC driver
			      Class.forName(JDBC_DRIVER);

			      //STEP 3: Open a connection
			      System.out.println("Connecting to database...");
			      conn = DriverManager.getConnection(DB_URL, USER, PASS);

			      //STEP 4: Execute a query
			      System.out.println("Creating database 'test'...");
			      stmt = conn.createStatement();
			      
			      String sql = "CREATE DATABASE test";
			      stmt.executeUpdate(sql);
			      System.out.println("Database 'test' created successfully...");
			   }catch(SQLException se){
			      //Handle errors for JDBC
			      se.printStackTrace();
			   }catch(Exception e){
			      //Handle errors for Class.forName
			      e.printStackTrace();
			   }finally{
			      //finally block used to close resources
			      try{
			         if(stmt!=null)
			            stmt.close();
			      }catch(SQLException se2){
			      }// nothing we can do
			      try{
			         if(conn!=null)
			            conn.close();
			      }catch(SQLException se){
			         se.printStackTrace();
			      }//end finally try
			   }//end try
			   System.out.println("Goodbye!");
			}//end JDBCExample
		
		// method which create Airlines table
		public void createTableAirlines() {
			   // JDBC driver name and database URL
			   final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
		       final String DB_URL = "jdbc:mysql://localhost/test";

			   //  Database credentials
			   final String USER = "root";
			   final String PASS = "root";
			   
			   Connection conn = null;
			   Statement stmt = null;
			   
			   try{
			      //STEP 2: Register JDBC driver
			      Class.forName(JDBC_DRIVER);

			      //STEP 3: Open a connection
			      System.out.println("Connecting to a selected database...");
			      conn = DriverManager.getConnection(DB_URL, USER, PASS);
			      System.out.println("Connected database successfully...");
			      
			      //STEP 4: Execute a query
			      System.out.println("Creating table 'aerlines' in given database...");
			      stmt = conn.createStatement();
			      
			      String sql = "CREATE TABLE airlines " 
					       + "(flightNumber INT(11), "
					       + "airline VARCHAR(45), "
					       + "additionalSpaceService VARCHAR(45), "
					       + "webRegistration VARCHAR(45), "
					       + "isMealincluded VARCHAR(45), "
					       + "PRIMARY KEY (flightNumber))"; 

			      stmt.executeUpdate(sql);
			      System.out.println("Created table 'aerlines' in given database...");
			   }catch(SQLException se){
			      //Handle errors for JDBC
			      se.printStackTrace();
			   }catch(Exception e){
			      //Handle errors for Class.forName
			      e.printStackTrace();
			   }finally{
			      //finally block used to close resources
			      try{
			         if(stmt!=null)
			            conn.close();
			      }catch(SQLException se){
			      }// do nothing
			      try{
			         if(conn!=null)
			            conn.close();
			      }catch(SQLException se){
			         se.printStackTrace();
			      }//end finally try
			   }//end try
			   System.out.println("Goodbye!");
		}//end JDBCExample
		

		// method which create Airport table
		public void createTableAirports() {
			   // JDBC driver name and database URL
			   final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
		       final String DB_URL = "jdbc:mysql://localhost/test";

			   //  Database credentials
			   final String USER = "root";
			   final String PASS = "root";
			   
			   Connection conn = null;
			   Statement stmt = null;
			   
			   try{
			      //STEP 2: Register JDBC driver
			      Class.forName(JDBC_DRIVER);

			      //STEP 3: Open a connection
			      System.out.println("Connecting to a selected database...");
			      conn = DriverManager.getConnection(DB_URL, USER, PASS);
			      System.out.println("Connected database successfully...");
			      
			      //STEP 4: Execute a query
			      System.out.println("Creating table 'airports' in given database...");
			      stmt = conn.createStatement();
			      
			      String sql = "CREATE TABLE airports "
			    		  + "(airport VARCHAR(45), "
			    		  + "dutyFree VARCHAR(45), " 
			    		  + "priorityBoarding VARCHAR(45), "
			    		  + "PRIMARY KEY (airport))";

			      stmt.executeUpdate(sql);
			      System.out.println("Created table 'airports' in given database...");
			   }catch(SQLException se){
			      //Handle errors for JDBC
			      se.printStackTrace();
			   }catch(Exception e){
			      //Handle errors for Class.forName
			      e.printStackTrace();
			   }finally{
			      //finally block used to close resources
			      try{
			         if(stmt!=null)
			            conn.close();
			      }catch(SQLException se){
			      }// do nothing
			      try{
			         if(conn!=null)
			            conn.close();
			      }catch(SQLException se){
			         se.printStackTrace();
			      }//end finally try
			   }//end try
			   System.out.println("Goodbye!");
		}//end JDBCExample
		
		
		// method which create Flights table
			public void createTableFlights() {
				   // JDBC driver name and database URL
				   final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
			       final String DB_URL = "jdbc:mysql://localhost/test";

				   //  Database credentials
				   final String USER = "root";
				   final String PASS = "root";
				   
				   Connection conn = null;
				   Statement stmt = null;
				   
				   try{
				      //STEP 2: Register JDBC driver
				      Class.forName(JDBC_DRIVER);

				      //STEP 3: Open a connection
				      System.out.println("Connecting to a selected database...");
				      conn = DriverManager.getConnection(DB_URL, USER, PASS);
				      System.out.println("Connected database successfully...");
				      
				      //STEP 4: Execute a query
				      System.out.println("Creating table 'flights' in given database...");
				      stmt = conn.createStatement();
				      
				      String sql = "CREATE TABLE flights "
						      + "(flightNumber INT(11), "
						      + "departureAirport VARCHAR(45), "
						      + "arrivalAirport VARCHAR(45), "
						      + "stopsNumber INT(11), averageTicketPrice INT(11), "
						      + "availableSeats INT(11), "
						      + "PRIMARY KEY (flightNumber))";

				      stmt.executeUpdate(sql);
				      System.out.println("Created table 'flights' in given database...");
				   }catch(SQLException se){
				      //Handle errors for JDBC
				      se.printStackTrace();
				   }catch(Exception e){
				      //Handle errors for Class.forName
				      e.printStackTrace();
				   }finally{
				      //finally block used to close resources
				      try{
				         if(stmt!=null)
				            conn.close();
				      }catch(SQLException se){
				      }// do nothing
				      try{
				         if(conn!=null)
				            conn.close();
				      }catch(SQLException se){
				         se.printStackTrace();
				      }//end finally try
				   }//end try
				   System.out.println("Goodbye!");
			}//end JDBCExample
			
			//method which fills Airlines table
			public void fillAirlinesTable() {
				   // JDBC driver name and database URL
				   final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
				   final String DB_URL = "jdbc:mysql://localhost/test";

				   //  Database credentials
				   final String USER = "root";
				   final String PASS = "root";
				   
				   Connection conn = null;
				   Statement stmt = null;
				   try{
				      //STEP 2: Register JDBC driver
				      Class.forName(JDBC_DRIVER);

				      //STEP 3: Open a connection
				      System.out.println("Connecting to a selected database...");
				      conn = DriverManager.getConnection(DB_URL, USER, PASS);
				      System.out.println("Connected database successfully...");
				      
				      //STEP 4: Execute a query
				      System.out.println("Inserting records into the table 'airlines'...");
				      stmt = conn.createStatement();
				      
				      String sql = "INSERT INTO airlines "
				      				+ "VALUES (1001,	'WizzAir',	'yes',	'no',	'no')";
				      		stmt.executeUpdate(sql);
				      		sql = "INSERT INTO airlines "
				                  + "VALUES (1002,	'WizzAir',	'no',	'no',	'no')";
						    stmt.executeUpdate(sql);
						    sql = "INSERT INTO airlines "
					               + "VALUES (1003, 'Lufthansa',	'no',	'yes',	'no')";
						    stmt.executeUpdate(sql);
							sql = "INSERT INTO airlines "
						           + "VALUES (1004,	'Lufthansa',	'yes',	'yes',	'yes')";
							stmt.executeUpdate(sql);
							sql = "INSERT INTO airlines "
					               + "VALUES (1005,	'Lufthansa',	'no',	'no',	'yes')";
							stmt.executeUpdate(sql);	    
							sql = "INSERT INTO airlines "
						           + "VALUES (1006,	'Lufthansa',	'yes',	'no',	'yes')";
							stmt.executeUpdate(sql);
							sql = "INSERT INTO airlines "
							        + "VALUES  (1007,	'Windrose Aero',	'yes',	'no',	'yes')";
						    stmt.executeUpdate(sql);
						    sql = "INSERT INTO airlines "
						    		+ "VALUES (1008,	'Windrose Aero',	'yes',	'no',	'yes')";
							stmt.executeUpdate(sql);			      
							sql = "INSERT INTO airlines "
						    		+ "VALUES (1009,	'WizzAir',	'no',	'no',	'no')";
							stmt.executeUpdate(sql);
						    sql = "INSERT INTO airlines "
								    + "VALUES (1010,	'Cathay Pacific',	'no',	'yes',	'yes')";
						    stmt.executeUpdate(sql);
							sql = "INSERT INTO airlines "
									+ "VALUES (1011,	'Cathay Pacific',	'yes',	'yes',	'no')";
							stmt.executeUpdate(sql);
							sql = "INSERT INTO airlines "
									+ "VALUES (1012,	'Austrian Airlines',	'no',	'yes',	'yes')";
							stmt.executeUpdate(sql);
							sql = "INSERT INTO airlines "
									+ "VALUES (1013,	'AirAsia',	'no',	'yes',	'yes')";
							stmt.executeUpdate(sql);
							sql = "INSERT INTO airlines "
								    + "VALUES (1014,	'Virgin',	'no',	'yes',	'yes')";
							stmt.executeUpdate(sql);
					    	sql = "INSERT INTO airlines "
									+ "VALUES (1015,	'Virgin',	'yes',	'no',	'no')";
					    	stmt.executeUpdate(sql);
							sql = "INSERT INTO airlines "
									+ "VALUES (1016,	'Virgin',	'yes',	'yes',	'no')";
							stmt.executeUpdate(sql);
						    sql = "INSERT INTO airlines "
									+ "VALUES (1017,	'AirAsia',	'no',	'no',	'no')";
						    stmt.executeUpdate(sql);
							sql = "INSERT INTO airlines "
									+ "VALUES (1018, 'Emirates',	'yes',	'yes',	'yes')";
							stmt.executeUpdate(sql);
							sql = "INSERT INTO airlines "
									+ "VALUES (1019,	'Ryanair',	'no',	'no',	'no')";
							stmt.executeUpdate(sql);
					   		sql = "INSERT INTO airlines	"
					   				+ "VALUES (1020,	'AirAsia',	'yes',	'no',	'yes')";		
					   		stmt.executeUpdate(sql);
					   		sql = "INSERT INTO airlines "
					   				+ "VALUES (1021, 'Windrose Aero',	'no',	'no',	'no')";
					   		stmt.executeUpdate(sql);
					   		sql = "INSERT INTO airlines "
					   				+ "VALUES (1022,	'WizzAir',	'no',	'no',	'no')";
					   		stmt.executeUpdate(sql);
				    		sql = "INSERT INTO airlines "
						    		+ "VALUES (1023,	'AirAsia',	'yes',	'yes',	'yes')";
				    		stmt.executeUpdate(sql);
						    sql = "INSERT INTO airlines "
								    + "VALUES (1024,	'AirAsia',	'no',	'no',	'no')";
						    stmt.executeUpdate(sql);
							sql = "INSERT INTO airlines "
									+ "VALUES (1025,	'Emirates',	'yes',	'yes',	'yes')";
							stmt.executeUpdate(sql);
							sql = "INSERT INTO airlines "
									+ "VALUES (1026,	'WizzAir',	'yes',	'no',	'yes')";
							stmt.executeUpdate(sql);
				    		sql = "INSERT INTO airlines "
				    				+ "VALUES (1027,	'Emirates',	'no',	'yes',	'no')";
				    		stmt.executeUpdate(sql);
				    		sql = "INSERT INTO airlines "
				    				+ "VALUES (1028,	'Austrian Airlines',	'no',	'no',	'no')";
				    		stmt.executeUpdate(sql);
				    		sql = "INSERT INTO airlines "
				    				+ "VALUES (1029,	'Turkish Airlines',	'yes',	'yes',	'yes')";
				    		stmt.executeUpdate(sql);
				    		sql = "INSERT INTO airlines "
						    		+ "VALUES (1030,	'Air France',	'yes',	'no',	'no')";
				    		stmt.executeUpdate(sql);
						    sql = "INSERT INTO airlines "
								   	+ "VALUES (1031,	'Air France',	'yes',	'no',	'yes')";
						    stmt.executeUpdate(sql);
							sql = "INSERT INTO airlines "
									+ "VALUES (1032,	'Air France',	'no',	'yes',	'no')";
							stmt.executeUpdate(sql);
							sql = "INSERT INTO airlines "
								  	+ "VALUES (1033, 'Air France',	'no',	'yes',	'no')";
							stmt.executeUpdate(sql);
				    		sql = "INSERT INTO airlines "
						    		+ "VALUES (1034,	'WizzAir',	'no',	'yes',	'yes')";
				    		stmt.executeUpdate(sql);
				    		sql = "INSERT INTO airlines "
						    		+ "VALUES (1035,	'Ryanair',	'no',	'yes',	'no')";
				    		stmt.executeUpdate(sql);
				    		
				    		System.out.println("Inserted records into the table 'airlines'...");
				      
				   }catch(SQLException se){
				      //Handle errors for JDBC
				      se.printStackTrace();
				   }catch(Exception e){
				      //Handle errors for Class.forName
				      e.printStackTrace();
				   }finally{
				      //finally block used to close resources
				      try{
				         if(stmt!=null)
				            conn.close();
				      }catch(SQLException se){
				      }// do nothing
				      try{
				         if(conn!=null)
				            conn.close();
				      }catch(SQLException se){
				         se.printStackTrace();
				      }//end finally try
				   }//end try
				   System.out.println("Goodbye!");
				}//end JDBCExample
			
			
			//method which fills Airport table
					public void fillAirportTable() {
						   // JDBC driver name and database URL
						   final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
						   final String DB_URL = "jdbc:mysql://localhost/test";

						   //  Database credentials
						   final String USER = "root";
						   final String PASS = "root";
						   
						   Connection conn = null;
						   Statement stmt = null;
						   try{
						      //STEP 2: Register JDBC driver
						      Class.forName(JDBC_DRIVER);

						      //STEP 3: Open a connection
						      System.out.println("Connecting to a selected database...");
						      conn = DriverManager.getConnection(DB_URL, USER, PASS);
						      System.out.println("Connected database successfully...");
						      
						      //STEP 4: Execute a query
						      System.out.println("Inserting records into the table 'airports'...");
						      stmt = conn.createStatement();
						      
						      String sql = "INSERT INTO airports "
						      				+ "VALUES ('Barcelona',	'yes',	'no')";
						      		stmt.executeUpdate(sql);
						      		sql = "INSERT INTO airports "
						                  + "VALUES ('Beijing',	'no',	'yes')";
								    stmt.executeUpdate(sql);
								    sql = "INSERT INTO airports "
							               + "VALUES ('Berlin',	'yes',	'no');";
								    stmt.executeUpdate(sql);
									sql = "INSERT INTO airports "
								           + "VALUES ('Budapest',	'yes',	'no')";
									stmt.executeUpdate(sql);
									sql = "INSERT INTO airports "
							               + "VALUES ('Helsinki',	'no',	'no')";
									stmt.executeUpdate(sql);	    
									sql = "INSERT INTO airports "
								           + "VALUES ('Kiev',	'yes',	'yes')";
									stmt.executeUpdate(sql);
									sql = "INSERT INTO airports "
									        + "VALUES  ('London',	'yes',	'yes')";
								    stmt.executeUpdate(sql);
								    sql = "INSERT INTO airports "
								    		+ "VALUES ('Milan',	'yes',	'yes')";
									stmt.executeUpdate(sql);			      
									sql = "INSERT INTO airports "
								    		+ "VALUES ('Munich',	'yes',	'no')";
									stmt.executeUpdate(sql);
								    sql = "INSERT INTO airports "
										    + "VALUES ('New York',	'no',	'no')";
								    stmt.executeUpdate(sql);
									sql = "INSERT INTO airports "
											+ "VALUES ('Ottava',	'no',	'no')";
									stmt.executeUpdate(sql);
									sql = "INSERT INTO airports "
											+ "VALUES ('Paris',	'yes',	'yes')";
									stmt.executeUpdate(sql);
									sql = "INSERT INTO airports "
											+ "VALUES ('Prague',	'yes',	'yes')";
									stmt.executeUpdate(sql);
									sql = "INSERT INTO airports "
										    + "VALUES ('Sydney',	'no',	'no')";
									stmt.executeUpdate(sql);
							    	sql = "INSERT INTO airports "
											+ "VALUES ('Vilnus',	'yes',	'yes')";
							    	stmt.executeUpdate(sql);
									
						    		System.out.println("Inserted records into the table 'airports'...");
						      
						   }catch(SQLException se){
						      //Handle errors for JDBC
						      se.printStackTrace();
						   }catch(Exception e){
						      //Handle errors for Class.forName
						      e.printStackTrace();
						   }finally{
						      //finally block used to close resources
						      try{
						         if(stmt!=null)
						            conn.close();
						      }catch(SQLException se){
						      }// do nothing
						      try{
						         if(conn!=null)
						            conn.close();
						      }catch(SQLException se){
						         se.printStackTrace();
						      }//end finally try
						   }//end try
						   System.out.println("Goodbye!");
						}//end JDBCExample

			
			
			//method which fills Flights table
			public void fillFlightsTable() {
				   // JDBC driver name and database URL
				   final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
				   final String DB_URL = "jdbc:mysql://localhost/test";

				   //  Database credentials
				   final String USER = "root";
				   final String PASS = "root";
				   
				   Connection conn = null;
				   Statement stmt = null;
				   try{
				      //STEP 2: Register JDBC driver
				      Class.forName(JDBC_DRIVER);

				      //STEP 3: Open a connection
				      System.out.println("Connecting to a selected database...");
				      conn = DriverManager.getConnection(DB_URL, USER, PASS);
				      System.out.println("Connected database successfully...");
				      
				      //STEP 4: Execute a query
				      System.out.println("Inserting records into the table 'flights'...");
				      stmt = conn.createStatement();
				      
				      String sql = "INSERT INTO flights "
				      				+ "VALUES (1001,	'London',	'Munich',	0,	90,	12)";
				      		stmt.executeUpdate(sql);
				      		sql = "INSERT INTO flights "
				                  + "VALUES (1002,	'London',	'New York',	1,	300,	0)";
						    stmt.executeUpdate(sql);
						    sql = "INSERT INTO flights "
					               + "VALUES (1003, 'London',	'Ottava',	1,	290,	2)";
						    stmt.executeUpdate(sql);
							sql = "INSERT INTO flights "
						           + "VALUES (1004,	'London',	'Milan', 0,	45,	33)";
							stmt.executeUpdate(sql);
							sql = "INSERT INTO flights "
					               + "VALUES (1005,	'New York',	'Sydney',	2,	681,	17)";
							stmt.executeUpdate(sql);	    
							sql = "INSERT INTO flights "
						           + "VALUES (1006,	'New York',	'Kiev',	1,	220,	80)";
							stmt.executeUpdate(sql);
							sql = "INSERT INTO flights "
							        + "VALUES  (1007,	'New York',	'Milan',	1,	440,	1)";
						    stmt.executeUpdate(sql);
						    sql = "INSERT INTO flights "
						    		+ "VALUES (1008,	'New York',	'Barcelona',	0,	375,	14)";
							stmt.executeUpdate(sql);			      
							sql = "INSERT INTO flights "
						    		+ "VALUES (1009,	'New York',	'Prague',	1,	410,	21)";
							stmt.executeUpdate(sql);
						    sql = "INSERT INTO flights "
								    + "VALUES (1010,	'New York',	'Helsinki',	1,	200,	5)";
						    stmt.executeUpdate(sql);
							sql = "INSERT INTO flights "
									+ "VALUES (1011,	'Budapest',	'London',	0,	15,	47)";
							stmt.executeUpdate(sql);
							sql = "INSERT INTO flights "
									+ "VALUES (1012,	'Budapest',	'Kiev',	0,	39,	0)";
							stmt.executeUpdate(sql);
							sql = "INSERT INTO flights "
									+ "VALUES (1013,	'Budapest',	'Vilnius',	0,	50,	11)";
							stmt.executeUpdate(sql);
							sql = "INSERT INTO flights "
								    + "VALUES (1014,	'Beijing',	'Helsinki',	2,	190,	33)";
							stmt.executeUpdate(sql);
					    	sql = "INSERT INTO flights "
									+ "VALUES (1015,	'Beijing',	'Barcelona', 1,	149,	13)";
					    	stmt.executeUpdate(sql);
							sql = "INSERT INTO flights "
									+ "VALUES (1016,	'Sydney',	'Berlin',	1,	800,	13)";
							stmt.executeUpdate(sql);
						    sql = "INSERT INTO flights "
									+ "VALUES (1017,	'Sydney', 'Munich',	1,	1200,	13)";
						    stmt.executeUpdate(sql);
							sql = "INSERT INTO flights "
									+ "VALUES (1018,	'Sydney',	'Milan',	1,	1000,	9)";
							stmt.executeUpdate(sql);
							sql = "INSERT INTO flights "
									+ "VALUES (1019,	'Paris',	'Ottava',	1,	999,	2)";
							stmt.executeUpdate(sql);
					   		sql = "INSERT INTO flights	"
					   				+ "VALUES (1020,	'Paris', 'Vilnius',	0,	67,	3)";		
					   		stmt.executeUpdate(sql);
					   		sql = "INSERT INTO flights "
					   				+ "VALUES (1021,	'Paris',	'Helsinki',	0,	95,	10)";
					   		stmt.executeUpdate(sql);
					   		sql = "INSERT INTO flights "
					   				+ "VALUES (1022,	'Paris',	'New York',	0,	212,	10)";
					   		stmt.executeUpdate(sql);
				    		sql = "INSERT INTO flights "
						    		+ "VALUES (1023,	'Kiev',	'New York',	2,	220,	25)";
				    		stmt.executeUpdate(sql);
						    sql = "INSERT INTO flights "
								    + "VALUES (1024,	'Kiev',	'Milan',	0,	99,	8)";
						    stmt.executeUpdate(sql);
							sql = "INSERT INTO flights "
									+ "VALUES (1025,	'Munich',	'London',	0,	15,	0)";
							stmt.executeUpdate(sql);
							sql = "INSERT INTO flights "
									+ "VALUES (1026,	'Ottava',	'Vilnius',	1,	333,	0)";
							stmt.executeUpdate(sql);
				    		sql = "INSERT INTO flights "
				    				+ "VALUES (1027,	'Ottava',	'Milan',	1,	310,	1)";
				    		stmt.executeUpdate(sql);
				    		sql = "INSERT INTO flights "
				    				+ "VALUES (1028,	'Ottava',	'Barcelona',	1,	310,	4)";
				    		stmt.executeUpdate(sql);
				    		sql = "INSERT INTO flights "
				    				+ "VALUES (1029,	'Berlin',	'Kiev',	0,	87,	7)";
				    		stmt.executeUpdate(sql);
				    		sql = "INSERT INTO flights "
						    		+ "VALUES (1030,	'Prague',	'Helsinki',	1,	87,	23)";
				    		stmt.executeUpdate(sql);
						    sql = "INSERT INTO flights "
								   	+ "VALUES (1031,	'Barcelona',	'Ottava',	1,	310,	6)";
						    stmt.executeUpdate(sql);
							sql = "INSERT INTO flights "
									+ "VALUES (1032,	'Helsinki',	'Budapest',	0,	94,	8)";
							stmt.executeUpdate(sql);
							sql = "INSERT INTO flights "
								  	+ "VALUES (1033,	'Milan',	'Beijing',	2,	190,	0)";
							stmt.executeUpdate(sql);
				    		sql = "INSERT INTO flights "
						    		+ "VALUES (1034,	'Milan',	'Sydney',	2,	725,	2)";
				    		stmt.executeUpdate(sql);
				    		sql = "INSERT INTO flights "
						    		+ "VALUES (1035,	'Vilnius',	'Munich',	0,	41,	100)";
				    		stmt.executeUpdate(sql);
				    		
				    		System.out.println("Inserted records into the table 'flights'...");
				      
				   }catch(SQLException se){
				      //Handle errors for JDBC
				      se.printStackTrace();
				   }catch(Exception e){
				      //Handle errors for Class.forName
				      e.printStackTrace();
				   }finally{
				      //finally block used to close resources
				      try{
				         if(stmt!=null)
				            conn.close();
				      }catch(SQLException se){
				      }// do nothing
				      try{
				         if(conn!=null)
				            conn.close();
				      }catch(SQLException se){
				         se.printStackTrace();
				      }//end finally try
				   }//end try
				   System.out.println("Goodbye!");
				}//end JDBCExample
				
			
			public enum Result {
				PASSED, FAILED, INVALID
			}
				
			// create connection to database
			protected void getConnection() {
					try {
						// JDBC driver name and database URL
						String DATABASE_DRIVER = "com.mysql.jdbc.Driver";
						String DATABASE_URL = "jdbc:mysql://localhost/test";

						// User credentials
						String USERNAME = "root";
						String PASSWORD = "root";

						// Register JDBC driver
						Class.forName(DATABASE_DRIVER);

						// Open a connection
						System.out.println("Connecting to database...");
						connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);

						hasConnection = true;
					}

					catch (Exception e) {
						// Handle errors for Class.forName
						hasConnection = false;
						e.printStackTrace();
					}
				}
}