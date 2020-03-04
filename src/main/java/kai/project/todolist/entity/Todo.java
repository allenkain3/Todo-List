package kai.project.todolist.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="todo")
public class Todo {
	
	//define fields
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	@Column(name="start_date")
	private Date startDate;
	
	@Column(name="task")
	private String task;
	
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	@Column(name="due_date")
	private Date dueDate;
	
	@Column(name="status")
	private String status;
	
	public Todo() {
		
	}

	public Todo(Date startDate, String task, Date dueDate, String status) {
		this.startDate = startDate;
		this.task = task;
		this.dueDate = dueDate;
		this.status = status;
	}
	
	public Todo(int id,Date startDate, String task, Date dueDate, String status) {
		this.id = id;
		this.startDate = startDate;
		this.task = task;
		this.dueDate = dueDate;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", startDate=" + startDate + ", task=" + task + ", dueDate=" + dueDate
				+ ", status=" + status + "]";
	}
	
	

}
