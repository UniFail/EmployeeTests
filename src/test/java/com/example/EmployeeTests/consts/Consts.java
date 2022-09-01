package com.example.EmployeeTests.consts;

import com.example.EmployeeTests.demain.Employee;

public class Consts {
    public static final Employee CORRECT_EMPLOYEE = new Employee("Ivan", "Ivanov", 150000, 1);

    public static final Employee NOT_CORRECT_EMPLOYEE = new Employee("ivan1", "ivanov574", 150000, 1);
    public static final Employee SAME1_EMPLOYEE = new Employee("Petr", "ivanov", 150000, 1);
    public static final Employee SAME2_EMPLOYEE = new Employee("Petr", "Ivanov", 150000, 1);

    public static final int DEP_NUMBER_CORRECT = 1;

    public static final int DEP_NUMBER_NOT_CORRECT = 6;

}
