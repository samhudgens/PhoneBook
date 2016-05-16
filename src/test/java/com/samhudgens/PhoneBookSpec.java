package com.samhudgens;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by samhudgens on 5/16/16.
 */
public class PhoneBookSpec {

    PhoneBook phoneBook;
    @Before
    public void initialize() {
        phoneBook = new PhoneBook();

        phoneBook.addEntry("Bob", "555-8787");
    }

    @Test
    public void addEntryTest() {
        String expected = "555-8787";
        String name = "Bob";
        phoneBook.addEntry(name, expected);
        String actual = phoneBook.lookup(name);
        assertEquals("The string should show a phone number", expected, actual);
    }

    @Test
    public void lookupTest() {
        String expected = "555-8787";
        String actual = phoneBook.lookup("Bob");
        assertEquals("The String should show the phone number", expected, actual);
    }

    @Test
    public void reverseLookup() {

        String expected = "Bob";
        String actual = phoneBook.reverseLookup("555-8787");
        assertEquals("String should show the name", expected, actual);
    }

    @Test
    public void removeEntryTest() {
        phoneBook.removeEntry("Bob");
        String actual = phoneBook.lookup("Bob");
        assertNull("Should be null", actual);
    }

}
