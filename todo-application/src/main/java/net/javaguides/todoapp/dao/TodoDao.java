/**
 * 
 */
package net.javaguides.todoapp.dao;

import java.sql.SQLException;
import java.util.List;
import net.javaguides.todoapp.model.Todo;

/**
 * @author sparshgarg
 *
 */

public interface TodoDao {
	/**
	 * Creates an entry of todo item
	 * 
	 * @param todo
	 * @throws SQLException
	 */
	void insertTodo(Todo todo) throws SQLException;
	
	/**
	 * Select todo item
	 * 
	 * @param todoId
	 * @return
	 * @throws SQLException 
	 */
	Todo selectTodo(long todoId) throws SQLException;
	
	/**
	 * select list of all todo's item
	 * 
	 * @return
	 */
	List<Todo> selectAllTodos();
	
	/**
	 * delete todo item using id
	 * 
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	boolean deleteTodo(int id) throws SQLException;
	
	/**
	 * update todo item
	 * 
	 * @param todo
	 * @return
	 * @throws SQLException
	 */
	boolean updateTodo(Todo todo) throws SQLException;
}
