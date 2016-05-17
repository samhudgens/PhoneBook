package com.samhudgens;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by samhudgens on 5/16/16.
 */
public class PhoneBookSpec {

    PhoneBook phoneBook;
    ArrayList<String> numbers;
    @Before
    public void initialize() {
        phoneBook = new PhoneBook();
        numbers = new ArrayList<String>();
        numbers.add("555-8787");
        numbers.add("873892483");
        phoneBook.addEntry("Bob", numbers);
    }

//    @Test
//    public void addEntryTest() {
//        ArrayList<String> expected = new ArrayList<String>();
//        expected.add("555-8787");
//        expected.add("873892483");
//        ArrayList<String> actual = phoneBook.addEntry("Bob", );
//        assertEquals("The string should show a phone number", expected, actual);
//    }

    @Test
    public void lookupTest() {
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("555-8787");
        expected.add("873892483");
        ArrayList<String> actual = phoneBook.lookup("Bob");
        assertEquals("Should test to see if numbers are the same", expected, actual);
    }

    @Test
    public void reverseLookup() {
        String expected = "Bob";
        String actual = phoneBook.reverseLookup("555-8787");
        assertEquals("String should show the name", expected, actual);
    }

    @Test
    public void removeEntryTest() {
        phoneBook.addEntry("Antonio", numbers);
        phoneBook.removeEntry("Bob");
        ArrayList<String> actual = phoneBook.lookup("Bob");
        assertNull("Should be null", actual);
    }

    @Test
    public void listAllEntriesTest() {
        phoneBook.addEntry("Anthony",numbers);
        String expected = "Name: Anthony\n"+
        "Number: 57382\n"+
        "Name: Bob\n"+
        "Number: 555-8787\n";
        String actual = phoneBook.listAllEntries();
        assertEquals("Should print a bunch of entries", expected, actual);
    }

    @Test
    public void listAllNamesTest() {
        phoneBook.addEntry("Anthony", numbers);
        String expected = "Anthony\nBob\n";
        String actual = phoneBook.listAllNames();
        assertEquals("should print the names", expected, actual);
    }
}
