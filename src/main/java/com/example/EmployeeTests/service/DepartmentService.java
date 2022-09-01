package com.example.EmployeeTests.service;

import com.example.EmployeeTests.demain.Employee;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class DepartmentService {
    private List<Employee> employees = new ArrayList<>();

    EmployeeService employeeService = new EmployeeService();


    public int maxSalary(Integer department) {
        return employees.stream()
                .filter(e -> e.getDepartment().equals(department))
                .map(Employee::getSalary).max(Comparator.naturalOrder()).get();
    }

    public int minSalary(Integer department) {
        return employees.stream()
                .filter(e -> e.getDepartment().equals(department))
                .map(Employee::getSalary).min(Comparator.naturalOrder()).get();
    }

    public List<Employee> allDep(Integer department) {
        return employees.stream()
                .filter(e -> e.getDepartment().equals(department))
                .collect(Collectors.toList());
    }

    public Map<Integer, List<Employee>> all() {

        Map<Integer, List<Employee>> employeesByDep = employees
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        return employeesByDep;
    }

}
