package com.udemy;

import java.util.LinkedList;

public class ChainedHashtable {

    private final LinkedList<StoredEmployee>[] hashtable;

    public ChainedHashtable() {
        hashtable = new LinkedList[10];
        for (int i = 0; i < hashtable.length; i++)
            hashtable[i] = new LinkedList<>();
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        hashtable[hashedKey].add(new StoredEmployee(key, employee));
    }

    public Employee get(String key) {
        int hashedKey = hashKey(key);
        LinkedList<StoredEmployee> temp = hashtable[hashedKey];
        for (StoredEmployee e : temp)
            if (key.equals(e.getKey()))
                return e.getEmployee();
        return null;
    }

    public void remove(String key) {
        int hashedKey = hashKey(key);
        hashtable[hashedKey].removeIf(temp -> key.equals(temp.getKey()));
    }

    private int hashKey(String key) {
//        return key.length() % hashtable.length;
        return Math.abs(key.hashCode() % hashtable.length);
    }

    @Override
    public String toString() {
        StringBuilder hash = new StringBuilder();
        for (LinkedList<StoredEmployee> temp : hashtable)
            if (!temp.isEmpty())
                for (StoredEmployee e : temp)
                    hash.append(e.getEmployee()).append("\n");
        return hash.toString();
    }
}
