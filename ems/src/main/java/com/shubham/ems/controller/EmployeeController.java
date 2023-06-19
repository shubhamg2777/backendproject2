package com.shubham.ems.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shubham.ems.constants.AppConstants;
import com.shubham.ems.dto.LeaveDetailsDto;
import com.shubham.ems.entity.Employee;
import com.shubham.ems.service.EmployeeService;

@RestController
@RequestMapping( name= AppConstants.EMPLOYEE_CONTROLLER)
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping(value= AppConstants.SAVE_EMPLOYEE)
	public void saveEmployee (@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
	}
	
	@GetMapping(value=AppConstants.GATE_EMPLOYEE)
	public List<Employee> getEmployee(){
		return employeeService.getAll();
	}
	
	

//	public void deleteById(Long id){
//	 employeeService.deleteById(id);
//	}
	
	@GetMapping(value= AppConstants.GET_EMPLOYEES_LEAVE_REQUEST)
	public @ResponseBody List<LeaveDetailsDto> getEmployeesLeaveDetails ( ) {
		return employeeService.getEmployeesLeaveDteails();
	}
	
	@GetMapping(value=AppConstants.GET_EMPLOYEES_BY_ID)
	public @ResponseBody  LeaveDetailsDto getLeaveByEmpId( @RequestParam("id") Long id) {
		return employeeService.getLeaveByEmpId(id);
	}
	
}
