package com.management.hr.model;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "users")
public @Data class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	
	@Column(name = "fname", nullable = false, length = 10)
	private String firstName;
	
	@Column(name = "mname", length = 10)
	private String middleName;
	
	@Column(name = "lname", nullable = false, length = 10)
	private String lastName;
	
	@Column(name = "email", nullable = false, length = 30)
	private String email;
	
	@Column(name = "phone", length = 15)
	private String phoneNo;
	
	@Column(name = "address", length = 300)
	private String address;
	
	@Column(name = "city", nullable = false)
	private String city;
	
	@Column(name = "date", nullable = false)
	private LocalDate joiningDate;
	
	@Column(name = "salary", nullable = false)
	private double salary;
	
	@Column(name = "gender", nullable = false)
	private String gender;
	
	@Column(name = "marriage")
	private String maritalStatus;
	
	@Column(name = "birth")
	private Date dateOfBirth;
	
	@Column(name = "emergency", length = 15)
	private String emergencyContact;
	
	@Column(name = "created", nullable = false)
	private LocalDateTime userCreated;
	
}
