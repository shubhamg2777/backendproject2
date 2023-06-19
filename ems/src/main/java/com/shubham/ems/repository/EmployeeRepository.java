package com.shubham.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shubham.ems.entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

