package org.example.employee_management_app;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Utils {
    public static ArrayList<Employee> populate() {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("kapil", "CEO", "Delhi", 45_00_000));
        employees.add(new Employee("ankur", "ASE", "banglore", 4_00_000));
        employees.add(new Employee("bde log", "ASE", "Delhi", 6_00_000));
        employees.add(new Employee("mohit", "CA", "banglore", 12_00_000));
        employees.add(new Employee("tushar", "SM", "banglore", 35_00_000));
        return employees;
    }

    public static void display(ArrayList<Employee> employees, Predicate<Employee> predicate) {
    for(Employee e : employees){
            if (predicate.test(e)) System.out.println(e);
        }
    }
}