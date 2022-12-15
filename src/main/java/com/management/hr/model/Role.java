package com.management.hr.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "roles")
public @Data class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rid;
	
	@Column(name = "role")
	private String roleName;
}
