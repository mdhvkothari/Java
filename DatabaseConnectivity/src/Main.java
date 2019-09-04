
import java.sql.*;

public class Main {
	public static void main(String[] args)throws Exception {
		try{
			String url ="jdbc:mysql://localhost:3306/test";
			String username="root";
			String password ="";
			Class.forName("com.mysql.jdbc.Driver");	
			Connection con = DriverManager.getConnection(url,username,password);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM student");
			while(rs.next()){
				String name = rs.getString("Name");
				int id = rs.getInt("id");
				System.out.println(name);
				System.out.println(id);
			}
			
			
			
		}
		catch(Exception e){
			
		}
	}

}
