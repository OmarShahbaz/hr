package com.management.hr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.hr.model.UserDetail;

public interface UserDetailRepo extends JpaRepository<UserDetail, Integer>{

}
