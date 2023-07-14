package com.java_ee_patterns.dto;

public class EmployeeDTO {
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private String name;
    private Integer salary;
    private Integer age;
}
