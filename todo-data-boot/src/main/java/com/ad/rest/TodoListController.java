package com.ad.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ad.entity.TodoList;
import com.ad.repo.TodoListRepository;
import com.ad.service.TodoService;

@RestController
@RequestMapping("/todo")
public class TodoListController {

	@Autowired
	private TodoService service;
	
	@PostMapping(value="/save/{id}", consumes="application/json")
	public String saveTodoList( @RequestBody TodoList td, @PathVariable("id") int id) {
		service.save(td,id);
		return "TodoList saved successfully!";
	}
	
	
	
	
	@GetMapping(value="/fetch/{id}",produces="application/json")
	public TodoList getTodoList(@PathVariable("id") int id) {
		return service.fetch(id);
	}
	
	@GetMapping(value="/list",produces="application/json")
	public List<TodoList> getAllTodoList(){
		return service.list();
	}
	
//	@GetMapping(value="/list/{id}",produces="application/json")
//	public List<TodoList> getTodoListById(@PathVariable("id") int id){
//		return service.listByUser(id);
//	}
//	
//	@GetMapping(value="/list/{status}",produces="application/json")
//	public List<TodoList> getTodoListByStatus(@PathVariable("status") String status){
//		return service.listByStatus(status);
//	}
	
	@GetMapping(value="/delete/{id}",produces="application/json")
	public String removeTodoList(@PathVariable("id") int id) {
		service.remove(id);
		return "TodoList Deleted Successfully";
	}
	

}
