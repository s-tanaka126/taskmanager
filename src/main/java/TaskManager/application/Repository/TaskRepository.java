package TaskManager.application.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import TaskManager.application.Entity.TaskEntity;

@Repository
public interface TaskRepository extends JpaRepository<TaskEntity, Integer>{
	
	    @Query(value = "select e from TaskEntity e where e.taskId = :taskId")
        public TaskEntity findByTaskId(@Param("taskId") int taskId);
}
