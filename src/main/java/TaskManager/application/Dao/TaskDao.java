package TaskManager.application.Dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import TaskManager.application.Entity.TaskEntity;

@Repository
public class TaskDao {
	
	@Autowired
	EntityManager em;
	
	public void taskContentInsert(TaskEntity taskEntity) {
		em.persist(taskEntity);
	}


}
