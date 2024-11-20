package com.ad.service;

import java.util.List;

import com.ad.entity.User;


public interface UserService {
	
    public String save(User u);
	
	public User fetch(int id) ;
	
	public List<User> list();
	
	public String remove(int id) ;
	
	

}
