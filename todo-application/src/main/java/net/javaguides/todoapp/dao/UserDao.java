package net.javaguides.todoapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import net.javaguides.todoapp.model.User;
import net.javaguides.todoapp.utils.JDBCUtils;

/**
 * class contains JDBC code to store User registered data into the users table
 * 
 * @author sparshgarg
 *
 */
public class UserDao {
	public int registerUser(User user) throws ClassNotFoundException {
		String INSERT_USERS_SQL = "INSERT INTO users" + "  (first_name, last_name, username, password) VALUES "
				+ " (?, ?, ?, ?);";

		int result = 0;
		// Create a statement using connection object
		try (Connection connection = JDBCUtils.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
			preparedStatement.setString(1, user.getFirstName());
			preparedStatement.setString(2, user.getLastName());
			preparedStatement.setString(3, user.getUsername());
			preparedStatement.setString(4, user.getPassword());

			System.out.println(preparedStatement);
			// Execute the query or update query
			result = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// process sql exception
			JDBCUtils.printSQLException(e);
		}
		return result;
	}
}
