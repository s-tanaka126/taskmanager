package TaskManager.application.Entity;


import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tasks")
public class TaskEntity {
	
	@Id
	@Column(name = "task_id")
	private int taskId;
	
	@Column(name = "task_name")
	private String taskName;
	
	@Column(name = "task_date")
	private Date taskDate;
	
	@Column(name = "task_time")
	private Time taskTime;
	
	@Column(name = "task_place")
	private String taskPlace;
	
	@Column(name = "complete_flag")
	private boolean completeFlag;
	

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public Date getTaskDate() {
		return taskDate;
	}

	public void setTaskDate(Date taskDate) {
		this.taskDate = taskDate;
	}

	public Time getTaskTime() {
		return taskTime;
	}

	public void setTaskTime(Time taskTime) {
		this.taskTime = taskTime;
	}

	public String getTaskPlace() {
		return taskPlace;
	}

	public void setTaskPlace(String taskPlace) {
		this.taskPlace = taskPlace;
	}

	public boolean isCompleteFlag() {
		return completeFlag;
	}

	public void setCompleteFlag(boolean completeFlag) {
		this.completeFlag = completeFlag;
	}

}
