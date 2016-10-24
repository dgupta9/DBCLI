
public class QueryConstants {
	// Query to insert user into DB
	public static String InsertUser = "insert into emp values(?,?,?)";
	
	public static String LoginQuery = "SELECT FirstName, LastName, isHS, isPatient, isSick FROM Users WHERE UserId=? AND password=?";
	
	public static String diseaseNamesQuery = "SELECT dName FROM Disease ORDER BY dName";
	
	public static String diagnosedQuery = "SELECT dName, fromDate, toDate FROM Diagnosed WHERE P_UserId=? ORDER BY dName";
	
}
