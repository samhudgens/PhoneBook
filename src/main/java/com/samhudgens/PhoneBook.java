package com.samhudgens;

import java.util.*;

/**
 * Created by samhudgens on 5/16/16.
 */
public class PhoneBook {

    private Map<String, ArrayList<String>> phoneBookEntries = new TreeMap<String, ArrayList<String>>();



    public ArrayList<String> lookup(String name) {
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

    public void addEntry(String name, ArrayList<String> number) {

        phoneBookEntries.put(name, number);
    }

    public void removeEntry(String name) {
        phoneBookEntries.remove(name);
    }


    public String listAllEntries() {
        String s = "";
        Set phoneBookSet = phoneBookEntries.entrySet();
        Iterator it = phoneBookSet.iterator();
        while(it.hasNext()) {
            Map.Entry contact= (Map.Entry)it.next();
            s += "Name: " + contact.getKey() + "\n" + "Number: " + contact.getValue() + "\n";
            //System.out.println("Name: " + contact.getKey() + "\n" + "Number: " + contact.getValue());
        }
        System.out.println(s);
        return s;
    }

    public String listAllNames() {
        String s = "";
        for(Map.Entry<String, ArrayList<String>> entry : phoneBookEntries.entrySet()) {
            String name = entry.getKey();
            s+= name + "\n";
        }
        System.out.println(s);
        return s;
    }

}
