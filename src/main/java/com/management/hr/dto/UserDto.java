package com.management.hr.dto;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class UserDto {
	
	private int uid;
	
	private String firstName;
	
	private String middleName;
	
	private String lastName;
	
	private String email;
	
	private String phoneNo;
	
	private String address;
	
	private String city;
	
	private LocalDate joiningDate;
	
	private double salary;
	
	private String gender;
	
	private String maritalStatus;
	
	private Date dateOfBirth;
	
	private String emergencyContact;
	
	private LocalDateTime userCreated;
}
