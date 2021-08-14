package player;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {
		Connection connection = null;
		try {
			//Driver Load
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Load Successfully");
			
			//Open Connection
			
			String url = "jdbc:mysql://localhost:3306/revature";
			String username = "root";
			String password = "root"; // Give your DB username and Password
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connection established");
			
			// Create Statement
			Statement statement = connection.createStatement();
			String sql = "select id,name,age,gender,city,sportsName,contact from player order by id desc";
			
			// Execute Query
			ResultSet resultSet = statement.executeQuery(sql);
			System.out.println("Query Excuted Successfully");
			
			//Process Details
			while(resultSet.next()) {
				System.out.print("Id : "+resultSet.getInt("id"));
				System.out.print(" Name : "+resultSet.getString("name"));
				System.out.print(" Gender : "+resultSet.getString("gender"));
				System.out.print(" City : "+resultSet.getString("city"));
				System.out.print(" Sports Name : "+resultSet.getString("sportsName"));
				System.out.print(" Age : "+resultSet.getInt("age"));
				System.out.println(" Contact : "+resultSet.getLong("contact"));
			}
			System.out.println("Results Processed");
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		finally {
			try {
				// Close Connection
				connection.close();
				System.out.println("Connection Closed");
			}catch(SQLException e){
				System.out.println(e);
			}
		}

	}

}
