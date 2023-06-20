package com.principles.s;

public class Accounting {

    public void changeSalary(Employee employee){
        int k = 1;//учитвать должность, стаж и т.д.
        employee.setSalary(employee.getSalary()+k);
    }

    public void changeWorkDate(){
        //добавляем год
    }
}
