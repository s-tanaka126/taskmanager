package taskmanagerController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskController {

	@GetMapping	("/task")
	public String taskForm(TaskRequest taskRequest) {
		
		return "/task/form";
	
	}	
}
