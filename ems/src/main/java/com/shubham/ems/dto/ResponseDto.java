package com.shubham.ems.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.shubham.ems.constants.AppConstants;

import lombok.Data;

@Data
@Entity
@Table(name = AppConstants.RESPONSEDTO)
public class ResponseDto implements Serializable {

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "id")
	private Long id;
	@Column(name = "status")
	private String status;
	@Column(name = "statusCode")
	private String statusCode;
	@Column(name = "data")
	private String data;
	@Column(name = "erorMessage")
	private String erorMessage;
//	@Column(name = "erorMessage")
//    private boolean message;
}
