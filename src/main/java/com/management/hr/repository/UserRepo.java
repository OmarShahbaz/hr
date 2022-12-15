package com.management.hr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.hr.model.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
