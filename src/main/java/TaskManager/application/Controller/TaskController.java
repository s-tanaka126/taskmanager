package TaskManager.application.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import TaskManager.application.Request.TaskRequest;

@Controller
@RequestMapping("/task")
public class TaskController {

	@GetMapping	("/list")
	public String taskForm(TaskRequest taskRequest) {
		
		return "/task/list";
	
	}
	
	@PostMapping("/task/complete")
	public String taskComplete(TaskRequest taskRequest) {
		
		return "redirect:/task";
	}
}
