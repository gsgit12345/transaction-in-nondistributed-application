package com.spring.demo.pojo;

public class Organization {
    private String empId;
    private String empName;
    private String healthInsuranceSchemeName;
    private int coverageAmount;

    Organization()
    {

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

    public String getHealthInsuranceSchemeName() {
        return healthInsuranceSchemeName;
    }

    public void setHealthInsuranceSchemeName(String healthInsuranceSchemeName) {
        this.healthInsuranceSchemeName = healthInsuranceSchemeName;
    }

    public int getCoverageAmount() {
        return coverageAmount;
    }

    public void setCoverageAmount(int coverageAmount) {
        this.coverageAmount = coverageAmount;
    }



    public Organization(String empId, String empName, String healthInsuranceSchemeName, int coverageAmount) {
        this.empId = empId;
        this.empName = empName;
        this.healthInsuranceSchemeName = healthInsuranceSchemeName;
        this.coverageAmount = coverageAmount;
    }


}
