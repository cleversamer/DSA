package com.udemy;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

//        employeeList.forEach(System.out::println);

//        System.out.println(employeeList.get(1));

//        System.out.println(employeeList.isEmpty());

        employeeList.set(1, new Employee("John", "Adams", 4568));
        employeeList.forEach(System.out::println);

        System.out.println(employeeList.size());

        employeeList.add(3, new Employee("John", "Doe", 4567));
//        employeeList.forEach(System.out::println);

        Employee[] employeeArray = employeeList.toArray(new Employee[0]);
        for (Employee e : employeeArray)
            System.out.println(e);

        System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));
        System.out.println(employeeList.indexOf(new Employee("John", "Doe", 4567)));

        employeeList.remove(2);
        employeeList.forEach(System.out::println);
    }
}
