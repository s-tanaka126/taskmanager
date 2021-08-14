package TaskManager.application.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TaskManager.application.Entity.TaskEntity;
import TaskManager.application.Repository.TaskRepository;


@Service
@Transactional
public class TaskService {
	
	
	/* @Autowired TaskDao taskDao; */
	 
	
	@Autowired
	TaskRepository taskRepository;
	
	public void registTask(TaskEntity task) {
		
		taskRepository.save(task);
	}
	
	
	  public List<TaskEntity> getTaskList(){
	  
	  return taskRepository.findAll(); 
	  
	  }
	 
	

}
