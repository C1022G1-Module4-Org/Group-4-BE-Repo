package com.example.cs_be_module4.repository.employee;

import com.example.cs_be_module4.model.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
}
