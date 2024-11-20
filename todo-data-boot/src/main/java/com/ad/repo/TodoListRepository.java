package com.ad.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ad.entity.TodoList;


public interface TodoListRepository extends JpaRepository<TodoList, Integer> {
	
//	@Query("FROM TodoList WHERE todolist.id=:id")
//	List<TodoList> listByUser(int id);
//	
//	@Query("FROM TodoList WHERE todolist.status=:status")
//	List<TodoList> listByStatus(String status);
//	
	
	
	

}
