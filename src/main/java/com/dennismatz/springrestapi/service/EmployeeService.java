package com.dennismatz.springrestapi.service;

import com.dennismatz.springrestapi.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getEmployees();

    Employee saveEmployee(Employee employee);

    Employee getSingleEmployee(Long id);

    void deleteEmployee(Long id);

    Employee updateEmployee (Employee employee);

    List<Employee> getEmployeesByName(String name);

    List<Employee> getEmployeesByNameAndLocation(String name, String location);

    List<Employee> getEmployeeByKeyword(String keyword);
}
