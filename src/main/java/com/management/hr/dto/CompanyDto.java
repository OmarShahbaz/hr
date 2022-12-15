package com.management.hr.dto;

import java.time.LocalDateTime;

import lombok.Data;

public @Data class CompanyDto {

	private int cid;
	
	private String companyName;
	
	private String companyDomain;
	
	private String companyContactNumber;
	
	private String companyAddress;
	
	private String companyCity;
	
	private boolean companyActive;
	
	private LocalDateTime companyCreated;
	
	private String email;
	
	private String password;
}
