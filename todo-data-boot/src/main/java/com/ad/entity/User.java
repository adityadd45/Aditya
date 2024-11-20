package com.ad.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Users")
public class User {
    @Id
	private int uid;
    
    @Column(name="uname",length=25)
	private String name;
	
    @JsonManagedReference
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private List<TodoList> todos;
	
	
	
	


	public int getUid() {
		return uid;
	}






	public void setUid(int uid) {
		this.uid = uid;
	}






	public String getName() {
		return name;
	}






	public void setName(String name) {
		this.name = name;
	}






	public List<TodoList> getTodos() {
		return todos;
	}






	public void setTodos(List<TodoList> todos) {
		this.todos = todos;
	}



	



	public User(int uid, String name, List<TodoList> todos) {
		
		this.uid = uid;
		this.name = name;
		this.todos = todos;
	}






	public User() {
		
	}

}
