package com.ad.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Todos")
public class TodoList {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="taskname", length=25)
	private String task;
	
	private String priority;
	
	private String status;
	
	private LocalDate adt= LocalDate.now();
	
	private LocalDate fdt;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="uid")
	private User user;
	
	
	

	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getTask() {
		return task;
	}




	public void setTask(String task) {
		this.task = task;
	}




	public String getPriority() {
		return priority;
	}




	public void setPriority(String priority) {
		this.priority = priority;
	}




	public String getStatus() {
		return status;
	}




	public void setStatus(String status) {
		this.status = status;
	}




	public LocalDate getAdt() {
		return adt;
	}




	public void setAdt(LocalDate adt) {
		this.adt = adt;
	}




	public LocalDate getFdt() {
		return fdt;
	}




	public void setFdt(LocalDate fdt) {
		this.fdt = fdt;
	}




	public User getUser() {
		return user;
	}




	public void setUser(User user) {
		this.user = user;
	}



	

	public TodoList(int id, String task, String priority, String status, LocalDate adt, LocalDate fdt, User user) {
		
		this.id = id;
		this.task = task;
		this.priority = priority;
		this.status = status;
		this.adt = adt;
		this.fdt = fdt;
		this.user = user;
	}




	public TodoList() {
		
	}

}
