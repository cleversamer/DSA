package com.udemy;

public class Main {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        ChainedHashtable hashtable = new ChainedHashtable();
        hashtable.put("Jones", janeJones);
        hashtable.put("Doe", johnDoe);
        hashtable.put("Wilson", mikeWilson);
        hashtable.put("Smith", marySmith);

        hashtable.remove("Wilson");
        hashtable.remove("Jones");
        System.out.println(hashtable);

        System.out.println("Retrieve key Smith: " + hashtable.get("Smith"));
    }
}
