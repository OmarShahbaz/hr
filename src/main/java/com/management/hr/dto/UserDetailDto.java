package com.management.hr.dto;

import com.management.hr.model.Company;
import com.management.hr.model.Role;
import com.management.hr.model.User;

import lombok.Data;

public @Data class UserDetailDto {
	
	private int uid;
	
	private User user;
	
	private Company company;
	
	private Role role;

}
