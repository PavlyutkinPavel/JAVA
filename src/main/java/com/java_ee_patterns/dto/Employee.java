package com.java_ee_patterns.dto;

public class Employee {
    private Integer id;
    private String name;
    private Integer salary;
    private Integer age;

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }

    public Integer getAge() {
        return age;
    }

    private Boolean isImportant;
    private  String IBAN;
}
