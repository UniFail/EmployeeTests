package com.example.EmployeeTests;

import com.example.EmployeeTests.demain.Employee;
import com.example.EmployeeTests.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

import static com.example.EmployeeTests.consts.Consts.*;


public class EmployeeServiceTest {
    EmployeeService employeeService = new EmployeeService();

    @ParameterizedTest
    @MethodSource("provideStringsForBlank")
    public void CheckTheEmployeeBeingAddedForComplianceWithTheConditions(){
        Employee employeeTest = employeeService.addEmployee(CORRECT_EMPLOYEE);

    }

    @Test
    public void CheckFindSameEmployee(){
        employeeService.addEmployee(SAME1_EMPLOYEE);
        employeeService.addEmployee(SAME2_EMPLOYEE);
        employeeService.findEmployee(SAME1_EMPLOYEE);
        employeeService.findEmployee(SAME2_EMPLOYEE);
    }
    @Test
    public void CheckDeleteSameEmployee(){
        employeeService.addEmployee(CORRECT_EMPLOYEE);
        employeeService.deleteEmployee(CORRECT_EMPLOYEE);
    }

}
