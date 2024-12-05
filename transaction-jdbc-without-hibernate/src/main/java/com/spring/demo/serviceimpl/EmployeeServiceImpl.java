package com.spring.demo.serviceimpl;

import com.spring.demo.dao.EmployeeDao;
import com.spring.demo.pojo.Employee;
import com.spring.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
//@Transactional(propagation = Propagation.NEVER)
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    @Override
    public void insertEmployee(Employee employee)   {
        employeeDao.insertEmployee(employee);
    }

    @Override
    public void deleteEmployeeById(String empid) {
        employeeDao.deleteEmployeeById(empid);
    }

}
