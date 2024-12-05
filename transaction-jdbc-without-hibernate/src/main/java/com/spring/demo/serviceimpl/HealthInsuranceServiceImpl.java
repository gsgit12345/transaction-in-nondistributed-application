package com.spring.demo.serviceimpl;

import com.spring.demo.dao.HealthInsuranceDao;
import com.spring.demo.exception.InvalidInsuranceAmountException;
import com.spring.demo.pojo.EmployeeHealthInsurance;
import com.spring.demo.service.HealthInsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HealthInsuranceServiceImpl implements HealthInsuranceService {

    @Autowired
    HealthInsuranceDao healthInsuranceDao;

    @Override
    public void registerEmployeeHealthInsurance(EmployeeHealthInsurance employeeHealthInsurance) throws InvalidInsuranceAmountException
    {
        if (employeeHealthInsurance.getCoverageAmount() < 0) {
            throw new InvalidInsuranceAmountException("Coverage Amount Should not be negative");
        }

        healthInsuranceDao.registerEmployeeHealthInsurance(employeeHealthInsurance);
    }

    @Override
    public void deleteEmployeeHealthInsuranceById(String empid) {
        healthInsuranceDao.deleteEmployeeHealthInsuranceById(empid);
    }

}
