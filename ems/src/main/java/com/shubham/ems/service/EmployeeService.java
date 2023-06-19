package com.shubham.ems.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.shubham.ems.dto.LeaveDetailsDto;
import com.shubham.ems.entity.Employee;
import com.shubham.ems.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeerepository;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void saveEmployee(Employee employee) {
		employeerepository.save(employee);
	}

	public List<Employee> getAll() {
		return employeerepository.findAll();
	}

	public Optional<Employee> findById(Long id) {
		return employeerepository.findById(id);

	}

	public void deleteById(Long id) {
		employeerepository.deleteById(id);

	}

	public List<LeaveDetailsDto> getEmployeesLeaveDteails() {
		String sqlQuery = "select emp.id, emp.name,leave_details.start_date,"
				+ "	leave_details.enddate , leave_details.totaldays"
				+ " From employee_info emp  LeftJoin "
				+" leave_details  ON emp.id = leave_details.employee_id ";
		
	List<LeaveDetailsDto>resultList=	jdbcTemplate.query(sqlQuery, (result,index)-> 
        new LeaveDetailsDto(
			result.getLong("id"),
			result.getString("name"),
			result.getDate("startdate"),
			result.getDate("enddate"),
			result.getLong("totaldays")
			
			)
		);
		return resultList;
		// another way 
//		List<LeaveDetailsDto> resultList = jdbcTemplate.query(sqlQuery, new BeanPropertyRowMapper<>(LeaveDetailsDto.class));
//		return resultList;
	}

	public LeaveDetailsDto getLeaveByEmpId(Long id) {
		List<LeaveDetailsDto> employeeLeaveDetailsList =   getEmployeesLeaveDteails();
return employeeLeaveDetailsList.stream().filter(e->e.getId()==id).findAny().orElse(null);
	
	}
	}
	
	
	
	
	
	
	

	
	
//	public void response(ResponseDto responsedto) {
//		try {
//			   if(responsedto.isSuccess()) {
//		            // Handle successful execution here
//		            // For example, log the success or return a success message
//		        } else {
//		           System.out.println("unsuccessfull response");
//		        }
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}

