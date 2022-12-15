package com.management.hr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.hr.model.Company;

public interface CompanyRepo extends JpaRepository<Company, Integer>{

}
