package TaskManager.application.Controller;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import TaskManager.application.Entity.TaskEntity;
import TaskManager.application.Request.TaskRequest;
import TaskManager.application.Service.TaskService;


@Controller
@RequestMapping("/task")
public class TaskController {

	@Autowired
	TaskService taskService;


	@GetMapping	("/list")
	public String displayList(TaskRequest taskRequest, Model model) {

		List<TaskEntity> taskList = taskService.getTaskList();
		model.addAttribute("taskList" , taskList);

		return "/task/list";

	}

	@PostMapping("/list")
	public String updateTask(TaskRequest taskRequest) {

		TaskEntity task = taskService.findByTaskId(taskRequest.getTaskId());

		task.setTaskName(taskRequest.getTaskName());
		if(taskRequest.getTaskDate() !="") {
			task.setTaskDate(Date.valueOf(taskRequest.getTaskDate()));
		}
		if(taskRequest.getTaskTime() !="") {
			if(taskRequest.getTaskTime().length() < 8) {
				taskRequest.setTaskTime(taskRequest.getTaskTime()+":00");
				task.setTaskTime(Time.valueOf(taskRequest.getTaskTime()));
			}
		}
		task.setTaskPlace(taskRequest.getTaskPlace());
		task.setCompleteFlag(taskRequest.isCompletFlag());

		taskService.updateTask(task);

		return "redirect:/task/list";
	}


	@PostMapping("/regist")
	public String registerTask(TaskRequest taskRequest) {

		TaskEntity task = new TaskEntity();
		task.setTaskName(taskRequest.getTaskName());

		taskService.registTask(task);

		return "redirect:/task/list";
	}

	@GetMapping("/detail")
	public String displayDetail(@RequestParam("taskId") int taskId, TaskRequest taskRequest, Model model) {

		TaskEntity task = taskService.findByTaskId(taskId);
		model.addAttribute("task", task);

		return "/task/detail";
	}
	
	@PostMapping("/delete")
	public String deleteTask(TaskRequest taskRequest) {
		taskService.deleteTask(taskRequest.getTaskId());
		
		return "redirect:/task/list";
		
	}
	
	@PostMapping("/complete")
	public String completeTask(TaskRequest taskRequest) {
		
		TaskEntity task = taskService.findByTaskId(taskRequest.getTaskId());
		task.setCompleteFlag(!task.isCompleteFlag());
		taskService.completeTask(task);
		
		return "redirect:/task/list";
	}

}