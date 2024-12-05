package com.spring.demo.pojo;

public class Employee {
    private String empId;
    private String empName;
    public Employee(String empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }
    public Employee() {

    }
    public String getEmpId() {
        return empId;
    }
    public void setEmpId(String empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }


}
