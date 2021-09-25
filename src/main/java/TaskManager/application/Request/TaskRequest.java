package TaskManager.application.Request;

import org.springframework.stereotype.Component;

@Component
public class TaskRequest {

	private int taskId;
	private String taskName;
	private String taskDate;
	private String taskTime;
	private String taskPlace;
	private boolean completFlag;

	public int getTaskId() {
		return taskId;
	}

	public String getTaskDate() {
		return taskDate;
	}

	public void setTaskDate(String taskDate) {
		this.taskDate = taskDate;
	}

	public String getTaskTime() {
		return taskTime;
	}

	public void setTaskTime(String taskTime) {
		this.taskTime = taskTime;
	}

	public String getTaskPlace() {
		return taskPlace;
	}

	public void setTaskPlace(String taskPlace) {
		this.taskPlace = taskPlace;
	}

	public boolean isCompletFlag() {
		return completFlag;
	}

	public void setCompletFlag(boolean completFlag) {
		this.completFlag = completFlag;
	}


	public String getTaskName() {
		return taskName;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

}
