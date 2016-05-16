package com.samhudgens;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by samhudgens on 5/16/16.
 */
public class PhoneBook {

    private Map<String, String> phoneBookEntries = new HashMap<String, String>();



    public String lookup(String name) {
        return phoneBookEntries.get(name);
    }

    public String reverseLookup(String number) {
        for (String name : phoneBookEntries.keySet()) {
            if (phoneBookEntries.get(name).equals(number)) {
                return name;
            }
        }
        return null;
    }

    public void addEntry(String name, String number) {

        phoneBookEntries.put(name, number);
    }

    public void removeEntry(String name) {
        phoneBookEntries.remove(name);
    }

    public void listAllEntries() {

    }

}
