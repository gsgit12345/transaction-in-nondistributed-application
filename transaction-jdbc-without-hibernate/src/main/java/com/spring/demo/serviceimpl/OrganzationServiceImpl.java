package com.spring.demo.serviceimpl;

import com.spring.demo.exception.InvalidInsuranceAmountException;
import com.spring.demo.pojo.Employee;
import com.spring.demo.pojo.EmployeeHealthInsurance;
import com.spring.demo.service.EmployeeService;
import com.spring.demo.service.HealthInsuranceService;
import com.spring.demo.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrganzationServiceImpl implements OrganizationService {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    HealthInsuranceService healthInsuranceService;

    @Override
    @Transactional(rollbackFor = InvalidInsuranceAmountException.class)
    public void joinOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance) throws InvalidInsuranceAmountException {
        employeeService.insertEmployee(employee);
      //  if (employee.getEmpId().equals("emp1")) {

           // throw new RuntimeException("thowing exception to test transaction rollback");
      //  }
        try {
            healthInsuranceService.registerEmployeeHealthInsurance(employeeHealthInsurance);
        } catch (InvalidInsuranceAmountException e) {
            throw new InvalidInsuranceAmountException("Exception is thrown");
        }
    }



    @Override
    public void leaveOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance) {
        employeeService.deleteEmployeeById(employee.getEmpId());
        healthInsuranceService.deleteEmployeeHealthInsuranceById(employeeHealthInsurance.getEmpId());
    }
}

