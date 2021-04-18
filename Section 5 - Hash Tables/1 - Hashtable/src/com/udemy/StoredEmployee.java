package com.udemy;

public class StoredEmployee {

    private final String key;
    private final Employee employee;

    public StoredEmployee(String key, Employee employee) {
        this.key = key;
        this.employee = employee;
    }

    public String getKey() {
        return key;
    }

    public Employee getEmployee() {
        return employee;
    }
}
