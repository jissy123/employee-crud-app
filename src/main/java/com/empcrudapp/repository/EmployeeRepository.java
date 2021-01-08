package com.empcrudapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empcrudapp.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
