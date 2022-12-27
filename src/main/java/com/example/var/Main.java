package com.example.var;

import com.example.record.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // ejemplo 1
        Employee employee1 = new Employee(1L, "employee1", 40000.0);
        var employee2 = new Employee(2L, "employee2", 50000.0);
        System.out.println(employee2);

        Double salary = employee2.salary();
        System.out.println(salary);



        // ejemplo 2
        List<Employee> employees1 = new ArrayList<>();

        var employees2 = new ArrayList<Employee>();
        employees2.add(new Employee("emp1"));
        System.out.println(employees2);

        var employees3 = List.of(
                new Employee("emp1"),
                new Employee("emp2"),
                new Employee("emp3")
        );
        System.out.println(employees3);




    }


}
