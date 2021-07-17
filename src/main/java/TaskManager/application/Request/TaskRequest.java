package TaskManager.application.Request;

import javax.persistence.Column;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import com.sun.istack.NotNull;

@Component
public class TaskRequest {
	
	@Id
	@Column(name = "task_id")
	@NotNull
	private int taskNo;
	
	private String taskName;

	public int getTaskNo() {
		return taskNo;
	}

	public void setTaskNo(int taskNo) {
		this.taskNo = taskNo;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	

}
