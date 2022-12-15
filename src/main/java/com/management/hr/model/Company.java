package com.management.hr.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "companies")
public @Data class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	
	@Column(name = "name", nullable = false)
	private String companyName;
	
	@Column(name = "domain")
	private String companyDomain;
	
	@Column(name = "contact", nullable = false)
	private String companyContactNumber;
	
	@Column(name = "address", length = 300)
	private String companyAddress;
	
	@Column(name = "city", nullable = false)
	private String companyCity;
	
	@Column(name = "active", nullable = false)
	private boolean companyActive;
	
	@Column(name = "created", nullable = false)
	private LocalDateTime companyCreated;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	@Column(name = "password", nullable = false)
	private String password;
}
