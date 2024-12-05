package com.spring.demo.service;

import com.spring.demo.exception.InvalidInsuranceAmountException;
import com.spring.demo.pojo.EmployeeHealthInsurance;

public interface HealthInsuranceService {
    void registerEmployeeHealthInsurance(EmployeeHealthInsurance employeeHealthInsurance) throws InvalidInsuranceAmountException;

    void deleteEmployeeHealthInsuranceById(String empid);
}
