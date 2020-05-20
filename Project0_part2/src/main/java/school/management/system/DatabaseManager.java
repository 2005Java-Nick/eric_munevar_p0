package school.management.system;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;

public class DatabaseManager {

	// DatabaseManager databaseManager = new DatabaseManager( "postgres", password );  // Create the database manager.
	
	 	private Connection connection = null;                                             // The database connection object.
	    private Statement statement;                                               // the database statement object, used to execute SQL commands.
	    
	    
	    
	    public DatabaseManager () {               // the constructor for the database manager.
//	        String url = "jdbc:postgresql://localhost:5432/postgres" + username;       
	        try {
	            Class.forName ("org.postgresql.Driver");                           // get the driver for this database.
	            System.out.println("Driver is set; ready to go!");
	        }
	        catch (Exception e) {
	            System.out.println("Failed to load JDBC/ODBC driver.");
	            return;                                                            // cannot even find the driver--return to caller since cannot do anything.
	        }

	        try {                                                                     // Establish the database connection, create a statement for execution of SQL commands.
	        	//Class.forName ("org.postgresql.Driver");                           // get the driver for this database.
	            //System.out.println("Driver is set; ready to go!");
	        	connection = DriverManager.
	        	getConnection ("jdbc:postgresql://rev-db.cp5qmegahrer.us-east-2.rds.amazonaws.com:5432/postgres", "postgres", "ThatswhatIdo7" );  // username and password are passed into this Constructor.
	            statement  = connection.createStatement();                            // statement used to do things in the database (e.g., create the PhoneBook table).
	            System.out.println("Database connection established!");
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
