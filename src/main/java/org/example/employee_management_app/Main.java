package org.example.employee_management_app;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = Utils.populate();
        // check desg is SM
        Predicate<Employee> checkManger = employee -> employee.getDesignation().equalsIgnoreCase("SM");

//        Utils.display(employees,checkManger);

        Predicate<Employee> checkBanglore = employee -> employee.getCity().equalsIgnoreCase("banglore");

//        Utils.display(employees,checkBanglore);

        Predicate<Employee> checkSalary = employee -> employee.getSalary() < 900000;

//        Utils.display(employees,checkSalary);

//        Utils.display(employees,checkBanglore.and(checkManger));

//        Utils.display(employees,checkSalary.or(checkManger));

//        Utils.display(employees,checkManger.negate());

        Predicate<String> p = Predicate.isEqual("Kapil");
        System.out.println(p.test("Kapil"));
        System.out.println(p.test("Kaushik"));
    }


}
