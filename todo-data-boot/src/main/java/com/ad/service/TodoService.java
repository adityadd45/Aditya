package com.ad.service;

import java.util.List;

import com.ad.entity.TodoList;
import com.ad.entity.User;

public interface TodoService {

	 public void save(TodoList td,int id);
		
		public TodoList fetch(int id) ;
		
		public List<TodoList> list();
		
		public void remove(int id) ;
		
//		public List<TodoList> listByUser(int id);
//		
//		public List<TodoList> listByStatus(String status);
		
		
}
