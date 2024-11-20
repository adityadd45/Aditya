package com.ad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ad.entity.TodoList;
import com.ad.entity.User;
import com.ad.repo.TodoListRepository;
import com.ad.repo.UserRepository;
@Service
public class TodoServiceImpl implements TodoService {


	@Autowired
	private TodoListRepository repo;
	
	@Autowired
	private UserRepository rept;

	@Override
	public void save(TodoList td,int id) {

		User u=rept.findById(id).get();
		td.setUser(u);
		repo.save(td);
		
		
	}

	@Override
	public TodoList fetch(int id) {
		
		return repo.findById(id).get();
	}

	@Override
	public List<TodoList> list() {
		
		return repo.findAll();
	}

	@Override
	public void remove(int id) {
		
		repo.deleteById(id);
		
		
	}
	
//	@Override
//	public List<TodoList> listByUser(int uid) {
//		
//		return repo.listByUser(uid);
//	}
//
//	@Override
//	public List<TodoList> listByStatus(String status) {
//		
//		return repo.listByStatus(status);
//	}

}
