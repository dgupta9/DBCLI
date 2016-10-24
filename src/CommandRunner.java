import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CommandRunner {
	
	public static boolean runLoginCommand(String uname,String pwd){
		Connection conn = ConnectionManager.getCon();
		PreparedStatement prepSql;
		
		try {
			prepSql = conn.prepareStatement(QueryConstants.LoginQuery);
			prepSql.setString(1, uname);
			prepSql.setString(2, pwd);
			System.out.println(prepSql);
			ResultSet rs = prepSql.executeQuery();
			
			
			if(rs.next()){
				String name = rs.getString("FirstName") + " " +rs.getString("LastName");
				PatientHealthSystem.userName = name;
				PatientHealthSystem.userID = uname;
				
				//session.setAttribute("UserID", uname);
				//session.setAttribute("FullName", name);
				
				PatientHealthSystem.isHS = rs.getInt("isHS");
				PatientHealthSystem.isPatient = rs.getInt("isPatient");
				PatientHealthSystem.isSick = rs.getInt("isSick");
				

				return true;
				
			}
			} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
		//return false;
	}
}
