/**
 * 
 */
package net.javaguides.todoapp.model;

import java.time.LocalDate;

/**
 * @author sparshgarg
 *
 */
public class Todo {
	private Long id;
    private String title;
    private String username;
    private String description;
    private LocalDate targetDate;
    private boolean status;
    
    protected Todo() {}
    public Todo(long id, String title, String username, String description, LocalDate targetDate, boolean isDone) {
        super();
        this.id = id;
        this.title = title;
        this.username = username;
        this.description = description;
        this.targetDate = targetDate;
        this.status = isDone;
    }
    public Todo(String title, String username, String description, LocalDate targetDate, boolean isDone) {
        super();
        this.title = title;
        this.username = username;
        this.description = description;
        this.targetDate = targetDate;
        this.status = isDone;
    }
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the targetDate
	 */
	public LocalDate getTargetDate() {
		return targetDate;
	}
	/**
	 * @param targetDate the targetDate to set
	 */
	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}
	/**
	 * @return the status
	 */
	public boolean getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}
	
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int)(id ^ (id >>> 32));
        return result;
	}
    
    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		if (id != other.getId())
			return false;
		return true;
	}
}
