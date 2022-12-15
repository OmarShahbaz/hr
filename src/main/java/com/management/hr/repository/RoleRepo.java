package com.management.hr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.hr.model.Role;

public interface RoleRepo extends JpaRepository<Role, Integer>{

}
