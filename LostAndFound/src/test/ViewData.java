package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ViewData {
	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;


	public ResultSet readDataBase() throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// Setup the connection with the DB
			connect = DriverManager
					.getConnection("jdbc:mysql://localhost/manish?"
							+ "user=user&password=user");

			// Statements allow to issue SQL queries to the database
			statement = connect.createStatement();

			resultSet = statement
					.executeQuery("select * from manish.inventry1");
			return resultSet;
		} 
		catch (Exception e) {
			throw e;
		}

	}
}
