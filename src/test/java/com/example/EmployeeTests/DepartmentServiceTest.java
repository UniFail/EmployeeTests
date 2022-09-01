package com.example.EmployeeTests;

import com.example.EmployeeTests.demain.Employee;
import com.example.EmployeeTests.service.DepartmentService;
import com.example.EmployeeTests.service.EmployeeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.example.EmployeeTests.consts.Consts.CORRECT_EMPLOYEE;
import static com.example.EmployeeTests.consts.Consts.DEP_NUMBER_CORRECT;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.anyInt;

@ExtendWith(MockitoExtension.class)
public class DepartmentServiceTest {

    DepartmentService departmentService;

    EmployeeService employeeService;
    List<Employee> expected = new ArrayList<>();

    @Mock
    private final Employee employee1 = new Employee("Ivan","Ivanov",150000,4);
    @Mock
    private final Employee employee2 = new Employee("Petr","Ivanov",50000,4);


    @Test
    public void CheckMaxSalaryFromDepartment() {
        assertNotNull(employee1.getSalary());
        assertNotNull(employee2.getSalary());
        expected.add(employee1);
        expected.add(employee2);
        Mockito.when(employee1.getSalary()).thenReturn(150000);
        assertEquals(expected.get(0).getSalary(),150000);
    }
    @Test
    public void CheckMinSalaryFromDepartment() {
        assertNotNull(employee1.getSalary());
        assertNotNull(employee2.getSalary());
        expected.add(employee1);
        expected.add(employee2);
        Mockito.when(employee2.getSalary()).thenReturn(50000);
        assertEquals(expected.get(1).getSalary(),50000);
    }
    @Test
    public void CheckDepartment() {
        assertNotNull(employee1.getDepartment());
        assertNotNull(employee2.getDepartment());
        expected.add(employee1);
        expected.add(employee2);
        Mockito.when(employee1.getDepartment()).thenReturn(4);
        Mockito.when(employee2.getDepartment()).thenReturn(4);
        assertEquals(expected.get(0).getDepartment(),4);
        assertEquals(expected.get(1).getDepartment(),4);
    }

}
