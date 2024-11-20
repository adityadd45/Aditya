package com.ad.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ad.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	
}
