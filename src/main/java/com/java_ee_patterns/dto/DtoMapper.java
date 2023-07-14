package com.java_ee_patterns.dto;

public class DtoMapper {
    public static EmployeeDTO fromEmployeeToDTO(Employee employee){
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setAge(employee.getAge());
        employeeDTO.setName(employee.getName());
        employeeDTO.setSalary(employee.getSalary());
        return employeeDTO;
    }
}
