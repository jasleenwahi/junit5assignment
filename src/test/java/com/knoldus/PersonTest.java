package com.knoldus;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class PersonTest {

    private Person person;
    @BeforeEach
    public void setup(){
        person = new Person();
    }


    // testing name getter setter for empty string.
    @Test
    public void nameTest_testing_setter_getter_for_name_test1(){
        person.setName("");
        assertEquals("", person.getName());
    }

    // testing name getter setter for non-empty string.
    @Test
    public void nameTest_testing_setter_getter_for_name_test2(){
        person.setName("jasleen");
        assertEquals("jasleen", person.getName());
    }

    // testing age getter setter for positive number.
    @Test
    public void ageTest_testing_setter_getter_for_age_test1(){
        person.setAge(32);
        assertEquals(32, person.getAge());
    }

    // testing age getter setter for negative number or zero.
    @Test
    public void ageTest_testing_setter_getter_for_age_test2(){
        person.setAge(0);
        assertTrue(person.getAge()<=0, "Age cannot be negative or zero");
    }

    // testing age getter setter for valid email.
    @Test
    public void emailTest_testing_setter_getter_for_email_test1(){
        person.setEmail("jasleenkaur556677@gmail.com");
        assertEquals("jasleenkaur556677@gmail.com", person.getEmail());
    }


    // ensuring email should contain @ symbol.
    @Test
    public void emailTest_testing_setter_getter_for_email_test2(){
        person.setEmail("jasleenkaur556677@gmail.com");
        String email = person.getEmail();
        assertTrue(email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}"));
    }

    @AfterEach
    public void tearDown(){
        System.out.println("called after every test");
    }
}
