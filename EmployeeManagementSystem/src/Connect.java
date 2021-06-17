import java.sql.*;


public class Connect {
	
	public Connection c;
	public Statement s;
	
	public Connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c= DriverManager.getConnection("jdbc:mysql:///AviateEmployees","root","");
			s = c.createStatement();
			System.out.println("Connection Successful!");
        }
		catch(Exception e) {
			System.out.println("Connection Failed!");
            e.printStackTrace();
        }
		
	}

}
