package TaskManager.application.Controller;


import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String displayList(TaskRequest taskRequest,Model model) {
		
		  List<TaskEntity> taskList = taskService.getTaskList();
		  model.addAttribute("taskList" , taskList);
		 
		return "/task/list";

	}

	@PostMapping("/regist")
	public String registrTask(TaskRequest taskRequest) {
		
		  TaskEntity task = new TaskEntity();
		  task.setTaskName(taskRequest.getTaskName());
		  
		  taskService.registTask(task);

		return "redirect:/task/list";

	}
}
