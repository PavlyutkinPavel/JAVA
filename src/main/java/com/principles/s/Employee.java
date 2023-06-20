package com.principles.s;

import java.util.Date;

public class Employee {
    private  int age;
    private String name;
    private String salary;
    private Date workdate;

    private String position;

    public void changeSalary(int salary){
        int k = 1;//учитвать должность, стаж и т.д.

    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void changeWorkDate(){
        //добавляем год
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
