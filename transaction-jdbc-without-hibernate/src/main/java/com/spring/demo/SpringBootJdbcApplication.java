package com.spring.demo;

import com.spring.demo.exception.InvalidInsuranceAmountException;
import com.spring.demo.pojo.Employee;
import com.spring.demo.pojo.EmployeeHealthInsurance;
import com.spring.demo.service.OrganizationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;

/**
 * Hello world!
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class SpringBootJdbcApplication {
    public static void main(String[] args) throws InvalidInsuranceAmountException {
        System.out.println("Hello World!");
        ApplicationContext context = SpringApplication.run(SpringBootJdbcApplication.class, args);
        OrganizationService organizationService = context.getBean(OrganizationService.class);

        Employee emp = new Employee();
        emp.setEmpId("emp1");
        emp.setEmpName("emp1");

        EmployeeHealthInsurance employeeHealthInsurance = new EmployeeHealthInsurance();
        employeeHealthInsurance.setEmpId("emp1");
        employeeHealthInsurance.setHealthInsuranceSchemeName("premium");
        employeeHealthInsurance.setCoverageAmount(-200);
try {
    organizationService.joinOrganization(emp, employeeHealthInsurance);

}catch(Exception ex)
{
    ex.printStackTrace();
}

    }
}
