package com.spring.demo.dao;

import com.spring.demo.pojo.EmployeeHealthInsurance;

public interface HealthInsuranceDao {
    void registerEmployeeHealthInsurance(EmployeeHealthInsurance employeeHealthInsurance);

    void deleteEmployeeHealthInsuranceById(String empid);
}
