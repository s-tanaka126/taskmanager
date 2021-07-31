package TaskManager.application.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TaskManager.application.Dao.TaskDao;
import TaskManager.application.Entity.TaskEntity;

@Service
@Transactional
public class TaskService {
	
	@Autowired
	TaskDao taskInsert;
	
	public void taskContentInsert(TaskEntity taskEntity) {
		
		taskInsert.taskContentInsert(taskEntity);
	}
}
