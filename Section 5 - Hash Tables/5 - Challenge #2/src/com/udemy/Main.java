package com.udemy;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Mike", "Wilson", 45));
        employees.add(new Employee("Mary", "Smith", 5555));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Bill", "End", 3948));
        employees.add(new Employee("Jane", "Jones", 123));

        employees.forEach(System.out::println);

        HashMap<Integer, Employee> employeeTable = new HashMap<>();
        List<Employee> remove = new ArrayList<>();

        for (Employee employee : employees)
            if (employeeTable.containsKey(employee.getID()))
                remove.add(employee);
            else
                employeeTable.put(employee.getID(), employee);

        for (Employee employee : remove)
            employees.remove(employee);

        System.out.println("-------------------------");

        employees.forEach(System.out::println);
    }
}
