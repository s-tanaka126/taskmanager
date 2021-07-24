package TaskManager.application.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import TaskManager.application.Entity.TaskEntity;
import TaskManager.application.Request.TaskRequest;
import TaskManager.application.Service.TaskService;


@Controller
@RequestMapping("/task")
public class TaskController {

	  @Autowired
	  TaskService taskService;
	  
	@GetMapping	("/list")
	public String taskList(TaskRequest taskRequest) {

		return "/task/list";

	}

	@PostMapping("/regist")
	public String taskRegist(TaskRequest taskRequest) {
		
		  TaskEntity taskEntity = new TaskEntity();
		  taskEntity.setTaskName(taskRequest.getTaskName());
		  
		  taskService.taskContentInsert(taskEntity);

		return "redirect:/task/list";
	}
}
