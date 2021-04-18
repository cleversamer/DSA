package com.udemy;

public class SimpleHashtable {

    private StoredEmployee[] hashtable;

    public SimpleHashtable() {
        this.hashtable = new StoredEmployee[10];
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);

        if (occupied(hashedKey)) {
            int stopIndex = hashedKey;
            hashedKey = (hashedKey == hashtable.length - 1) ? 0 : ++hashedKey;

            while (occupied(hashedKey) && hashedKey != stopIndex)
                hashedKey = (hashedKey + 1) % hashtable.length;
        }

        if (occupied(hashedKey))  // this means that the array is full.
            System.out.println("Sorry, there's an employee at position " + hashedKey);
        else
            hashtable[hashedKey] = new StoredEmployee(key, employee);
    }

    public Employee get(String key) {
        int hashedKey = findKey(key);

        if (hashedKey == -1)
            return null;

        return hashtable[hashedKey].getEmployee();
    }

    private int findKey(String key) {
        int hashedKey = hashKey(key);

        if (hashtable[hashedKey] != null && hashtable[hashedKey].getKey().equals(key))
            return hashedKey;

        int stopIndex = hashedKey;
        hashedKey = (hashedKey == hashtable.length - 1) ? 0 : ++hashedKey;

        while (hashedKey != stopIndex && hashtable[hashedKey] != null && !hashtable[hashedKey].getKey().equals(key))
            hashedKey = (hashedKey + 1) % hashtable.length;

        return (hashtable[hashedKey] != null && hashtable[hashedKey].getKey().equals(key)) ? hashedKey : -1;
    }

    public void remove(String key) {
        int hashedKey = findKey(key);

        if (hashedKey == -1)
            return;


        hashtable[hashedKey] = null;
        StoredEmployee[] oldHashtable = this.hashtable;
        hashtable = new StoredEmployee[oldHashtable.length];

        for (StoredEmployee temp : oldHashtable)
            if (temp != null)
                put(temp.getKey(), temp.getEmployee());
    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    private boolean occupied(int index) {
        return hashtable[index] != null;
    }

    @Override
    public String toString() {
        StringBuilder hashtable = new StringBuilder();
        for (int i = 0; i < this.hashtable.length; i++)
            hashtable.append("Position ").append(i).append(": ").append((this.hashtable[i] == null) ? "empty\n" : this.hashtable[i].getEmployee() + "\n");

        return hashtable.toString();
    }
}
