package com.spring.demo.service;

import com.spring.demo.exception.InvalidInsuranceAmountException;
import com.spring.demo.pojo.Employee;
import com.spring.demo.pojo.EmployeeHealthInsurance;

public interface OrganizationService {

    public void joinOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance) throws InvalidInsuranceAmountException;

    public void leaveOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance);

}
