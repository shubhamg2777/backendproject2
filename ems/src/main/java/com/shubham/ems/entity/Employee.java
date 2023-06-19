package com.shubham.ems.entity;



import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import com.shubham.ems.constants.AppConstants;

@Data
@Entity
@Table(name= AppConstants.EMPLOYEE_INFO)
public class Employee implements Serializable{

	
	@Id
	@GeneratedValue
	@Column(name="id")
	private Long id;

	@Column(name="name")
	private String name;

	@Column(name="email")
	private String email;

	@Column(name="role")
	private String role;

	@Column(name="band")
	private String band;

	@Column(name="status")
	private String status;

	@Column(name="startdate")
	private Date startDate;
}
