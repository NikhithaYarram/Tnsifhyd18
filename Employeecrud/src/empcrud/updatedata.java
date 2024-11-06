package empcrud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class updatedata {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/employee";
		String username = "root";
		String password = "root";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		    String sql = "UPDATE employee SET name=?,salary=?, email=? WHERE id=?";
		    
		    PreparedStatement statement = conn.prepareStatement(sql);
		    statement.setString(1, "sony");
		    statement.setString(2, "89000");
		    statement.setString(3, "sony@gmail.com");
		    statement.setString(4, "5");
		     
		    int rowsUpdated = statement.executeUpdate();
		    if (rowsUpdated > 0) {
		        System.out.println("An existing user was updated successfully!");
		    }
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
	}
}