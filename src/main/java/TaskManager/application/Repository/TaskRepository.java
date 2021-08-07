package TaskManager.application.Repository;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import TaskManager.application.Entity.TaskEntity;

@Repository
public interface TaskRepository extends JpaRepository<TaskEntity, Integer>{

}
