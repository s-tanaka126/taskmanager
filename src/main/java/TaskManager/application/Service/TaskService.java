package TaskManager.application.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
=======
import TaskManager.application.Dao.TaskDao;
import TaskManager.application.Entity.TaskEntity;

>>>>>>> c1362f4b71a302bb5d608c9a46a67c9bac66cb98
@Service
@Transactional
public class TaskService {
	
	@Autowired
<<<<<<< HEAD

=======
	TaskDao taskInsert;
	
	public void taskContentInsert(TaskEntity taskEntity) {
		
		taskInsert.taskContentInsert(taskEntity);
	}
>>>>>>> c1362f4b71a302bb5d608c9a46a67c9bac66cb98
}
