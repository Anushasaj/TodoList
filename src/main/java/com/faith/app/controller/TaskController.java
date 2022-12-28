package com.faith.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.entity.Task;
import com.faith.app.repository.ITaskRepository;


@RestController
@RequestMapping("/api")
@CrossOrigin
//(origins = "http://localhost:8081")
public class TaskController {

	@Autowired
	private ITaskRepository taskRepo;
	
	//get all task
	
	@CrossOrigin
	@GetMapping("/task")
	public List<Task>getTask(){
		return taskRepo.findAll();
	}
	
//	//get task by Id
//	@GetMapping("/task/{id}")
//	public Optional<Task>getTask(@PathVariable int id){
//		return taskService.getTask(id) ;
//	}
	//add task
	@CrossOrigin
	@PostMapping("/taskNote")
	public Task addTask(@RequestBody Task task) {
		return taskRepo.save(task);
	}
//	//update task
//	@PutMapping("/task")
//	public void updateTask(@RequestBody Task task) {
//		taskService.saveTask(task);
//	}
	
	//delete task
	@CrossOrigin
	@DeleteMapping("/task/{id}")
	public void deleteTask(@PathVariable String id) {
		taskRepo.deleteById(id);
	
	}
	//custom method to search name using JPQL
//	@GetMapping("/employees/search/{name}")
//	public List<Employee>getAllEmployeesByName(@PathVariable String name){
//		return taskService.getAllEmployeesByName(name) ;
//	}
}
