package com.javguide.ems_backend.repository;

import com.javguide.ems_backend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public class EmployeeRepository extends JpaRepository<Employee, Long> {

}