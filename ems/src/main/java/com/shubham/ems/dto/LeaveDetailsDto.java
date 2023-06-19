package com.shubham.ems.dto;

import java.util.Date;

public class LeaveDetailsDto {

	
	private Long id;
	private String name;
	private Date startdays;
	private Date enddays;
	private Long totaldays;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getStartdays() {
		return startdays;
	}
	public void setStartdays(Date startdays) {
		this.startdays = startdays;
	}
	public Date getEnddays() {
		return enddays;
	}
	public void setEnddays(Date enddays) {
		this.enddays = enddays;
	}
	public Long getTotaldays() {
		return totaldays;
	}
	public void setTotaldays(Long totaldays) {
		this.totaldays = totaldays;
	}
	public LeaveDetailsDto(Long id, String name, Date startdays, Date enddays, Long totaldays) {
		super();
		this.id = id;
		this.name = name;
		this.startdays = startdays;
		this.enddays = enddays;
		this.totaldays = totaldays;
	}
	
}
