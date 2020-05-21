package school.management.system;

import java.sql.*;
//import org.apache.log4j.Logger;
import org.apache.log4j.*;

public class DatabaseManager {


		private static Logger log = Logger.getLogger(DatabaseManager.class);
	 	private Connection connection = null;                                             // The database connection object.
	 	private Statement stmt;

	    
	 	public static void addStudent(String name, int feesPaid) throws Exception {
	 		Connection con = DriverManager.getConnection(name);
	 		PreparedStatement pstmt = null;
	 		try {
	 			String query = "insert into Students (studentname, feespaid);";
	 			pstmt = con.prepareStatement(query);
	 			
	 			pstmt.setString(1, name);
	 			pstmt.setInt(2, feesPaid);
	 			pstmt.executeUpdate();
	 			
	 		} catch (Exception e) {
	 			
	 		}
	 	}
	 	
	 	
	 	
	    public static void viewTable(Connection conn, String dbName)throws SQLException {

	        Statement stmt = null;
	    	PreparedStatement pstmt;
	    	String Set_School_Table = "update school set ... =-? where user_profile_name =";
	        String Get_School_Table = "select * from school_management_system.school";
//	        Private static final String Get_Student_Table = "select * from school_management_system.student";
//	        Private static final String Get_Teacher_Table = "select * from school_management_system.teacher";
	        			        		
	        try {
	            pstmt = (PreparedStatement) conn.createStatement();
	            ResultSet rs = pstmt.executeQuery(Get_School_Table);
	            while (rs.next()) {
	                String schoolname = rs.getString("schoolname");
	                int schoolid = rs.getInt("schoolid");
	                School.totalRevenue = rs.getInt("revenue");
	                int expenses = rs.getInt("expenses");
	                System.out.println(schoolname + "\t" + schoolid +
	                                   "\t" + "\t" + School.totalRevenue +
	                                   "\t" + expenses);
	            }
	        } catch (SQLException exception ) {
	            //JDBCTutorialUtilities.printSQLException(exception);
	            System.out.println ("\n*** SQLException caught ***\n");
	            while (exception != null) 
	            {                                                                     // grab the exception caught to tell us the problem.
	                System.out.println ("SQLState:   " + exception.getSQLState()  );
	                System.out.println ("Message:    " + exception.getMessage()   );
	                System.out.println ("Error code: " + exception.getErrorCode() );
	                exception = exception.getNextException ();
	                System.out.println ( "" );
	            }
	        } finally {
	            if (stmt != null) { stmt.close(); }
	        }
	    }
	    
	    public DatabaseManager () {               // the constructor for the database manager.
//	        String url = "jdbc:postgresql://localhost:5432/postgres" + username;       
	        //PropertyConfigurator.configure("log4j.properties");
	    	try {
	            Class.forName ("org.postgresql.Driver");                           // get the driver for this database.
	            log.info("Successfully found JDBC Driver");
	            //System.out.println("Driver is set; ready to go!");
	        }
	        catch (Exception e) {
	        	log.error("Failed to find JDBC Driver");
	            //System.out.println("Failed to load JDBC/ODBC driver.");
	            return;                                                            // cannot even find the driver--return to caller since cannot do anything.
	        }

	        try {                                                                     // Establish the database connection, create a statement for execution of SQL commands.
	        	//Class.forName ("org.postgresql.Driver");                           // get the driver for this database.
	            //System.out.println("Driver is set; ready to go!");
	        	connection = DriverManager.
	        	getConnection ("jdbc:postgresql://rev-db.cp5qmegahrer.us-east-2.rds.amazonaws.com:5432/postgres", "postgres", "ThatswhatIdo7" );  // username and password are passed into this Constructor.
	            stmt  = connection.createStatement();                            // statement used to do things in the database (e.g., create the PhoneBook table).
	            log.info("Successful connection to Database");
	            //System.out.println("Database connection established!");
	        }
	        catch (SQLException exception ) {
	            System.out.println ("\n*** SQLException caught ***\n");
	            while (exception != null) 
	            {                                                                     // grab the exception caught to tell us the problem.
	                System.out.println ("SQLState:   " + exception.getSQLState()  );
	                System.out.println ("Message:    " + exception.getMessage()   );
	                System.out.println ("Error code: " + exception.getErrorCode() );
	                exception = exception.getNextException ();
	                System.out.println ( "" );
	            }
	        }
	        catch (java.lang.Exception exception) {                                  // perhaps there is an exception that was not SQL related.
	            exception.printStackTrace();                                         // shows a trace of the exception error--like we see in the console.
	        }
	    }
//	    unchecked exception for error
//	    yellow line warning, not used variable etc
//	    consol log, sysouts, log info in trace
//	
	
}
