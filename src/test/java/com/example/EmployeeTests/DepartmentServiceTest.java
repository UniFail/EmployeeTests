package com.example.EmployeeTests;

import com.example.EmployeeTests.demain.Employee;
import com.example.EmployeeTests.service.DepartmentService;
import com.example.EmployeeTests.service.EmployeeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.example.EmployeeTests.consts.Consts.CORRECT_EMPLOYEE;
import static com.example.EmployeeTests.consts.Consts.DEP_NUMBER_CORRECT;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;

public class DepartmentServiceTest {

    DepartmentService departmentService;
    EmployeeService employeeService;
    Employee employee;

    @Test
    public void CheckMaxSalaryFromDepartment() {
        List<Employee> employeeList = new ArrayList<>(List.of(CORRECT_EMPLOYEE));
        Mockito.when(departmentService.maxSalary(DEP_NUMBER_CORRECT)).thenReturn(employeeList.size());
    }

}
