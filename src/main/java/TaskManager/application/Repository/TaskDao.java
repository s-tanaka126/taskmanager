/*
 * package TaskManager.application.Repository;
 * 
 * import java.util.List;
 * 
 * import javax.persistence.EntityManager;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Repository;
 * 
 * import TaskManager.application.Entity.TaskEntity;
 * 
 * @Repository public class TaskDao {
 * 
 * @Autowired EntityManager em;
 * 
 * @SuppressWarnings("unchecked") public List<TaskEntity> findAll(){
 * StringBuilder query = new StringBuilder();
 * query.append("SELECT * FROM tasks"); return
 * em.createNativeQuery(query.toString(), TaskEntity.class).getResultList(); }
 * 
 * public void registTask(TaskEntity task) { em.persist(task); }
 * 
 * 
 * }
 * 
 * 
 */