import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {
	
	static final String jdbcURL = "jdbc:oracle:thin:@orca.csc.ncsu.edu:1521:orcl01";
	static final String user = "dgupta9";
	static final String passwd = "200151449";
	private static Connection dbCon = null;
	
	public static Connection getCon(){
		try{
			if(dbCon == null){
				Class.forName("oracle.jdbc.driver.OracleDriver");
				dbCon = DriverManager.getConnection(jdbcURL, user, passwd);
			}
			if(dbCon== null){
				System.out.println("Failed to connect to DB");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return dbCon;
	}
}
