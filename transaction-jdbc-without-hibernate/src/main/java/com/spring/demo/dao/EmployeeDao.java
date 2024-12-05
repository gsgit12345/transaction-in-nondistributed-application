package com.spring.demo.dao;

import com.spring.demo.pojo.Employee;

public interface EmployeeDao {
    void insertEmployee(Employee cus);

    void deleteEmployeeById(String empid);
}
