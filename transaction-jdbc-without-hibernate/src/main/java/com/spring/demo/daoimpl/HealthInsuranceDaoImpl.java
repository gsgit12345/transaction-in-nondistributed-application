package com.spring.demo.daoimpl;

import com.spring.demo.dao.HealthInsuranceDao;
import com.spring.demo.pojo.EmployeeHealthInsurance;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class HealthInsuranceDaoImpl extends JdbcDaoSupport implements HealthInsuranceDao {

    @Autowired
    DataSource dataSource;

    @PostConstruct
    private void initialize() {
        setDataSource(dataSource);
    }

    @Override
    public void registerEmployeeHealthInsurance(EmployeeHealthInsurance emp) {
        String sql = "INSERT INTO employeeHealthInsurance "
                + "(empId, healthInsuranceSchemeName, coverageAmount) VALUES (?, ?,?)";
        getJdbcTemplate().update(sql,
                new Object[] { emp.getEmpId(), emp.getHealthInsuranceSchemeName(), emp.getCoverageAmount() });
    }

    @Override
    public void deleteEmployeeHealthInsuranceById(String empid) {
        String sql = "DELETE FROM employeeHealthInsurance WHERE empId = ?";
        getJdbcTemplate().update(sql, new Object[] { empid });

    }
}
