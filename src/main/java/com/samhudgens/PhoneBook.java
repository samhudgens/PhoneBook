package com.samhudgens;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by samhudgens on 5/16/16.
 */
public class PhoneBook {

    Map<String, String> phoneBookEntries;

    PhoneBook() {
        phoneBookEntries = new HashMap<String, String>();
    }

    public String lookup(String name) {
        return phoneBookEntries.get(name);
    }

    public void addEntry(String name, String number) {

        phoneBookEntries.put(name, number);
    }

    public void removeEntry(String name) {
        phoneBookEntries.remove(name);
    }
}
