package com.spring.demo.service;

import com.spring.demo.pojo.Employee;

public interface EmployeeService {
    void insertEmployee(Employee emp) ;

    void deleteEmployeeById(String empid);
}
