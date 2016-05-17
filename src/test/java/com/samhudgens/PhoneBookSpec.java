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
        //phoneBook.addEntry(name, expected);
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

    @Test
    public void listAllEntriesTest() {
        phoneBook.addEntry("Anthony","57382");
        String expected = "Name: Anthony\n"+
        "Number: 57382\n"+
        "Name: Bob\n"+
        "Number: 555-8787\n";
        String actual = phoneBook.listAllEntries();
        assertEquals("Should print a bunch of entries", expected, actual);
    }

    @Test
    public void listAllNamesTest() {
        phoneBook.addEntry("Anthony", "573582");
        String expected = "Anthony\nBob\n";
        String actual = phoneBook.listAllNames();
        assertEquals("should print the names", expected, actual);
    }
}
