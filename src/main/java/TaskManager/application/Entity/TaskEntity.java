package TaskManager.application.Entity;

<<<<<<< HEAD
=======

>>>>>>> c1362f4b71a302bb5d608c9a46a67c9bac66cb98
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tasks")
public class TaskEntity {
	
	@Id
<<<<<<< HEAD
	@Column(name = "task_id")
	private int taskId;
	
	@Column(name = "task_name")
	private String taskName;

=======
	@Column(name = "task_no")
	private int taskId;
	
>>>>>>> c1362f4b71a302bb5d608c9a46a67c9bac66cb98
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
<<<<<<< HEAD
=======

	@Column(name = "task_name")
	private String taskName;
	

>>>>>>> c1362f4b71a302bb5d608c9a46a67c9bac66cb98

}
