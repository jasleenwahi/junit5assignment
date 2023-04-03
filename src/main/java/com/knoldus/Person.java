package com.knoldus;
import java.util.Scanner;
public class Person
{
    private String name;
    private Integer age;
    private String email;

    // getter for name.
    public String getName() {
        return name;
    }

    // setter for name.
    public void setName(String name) {
        this.name = name;
    }

    // getter for age.
    public Integer getAge() {
        return age;
    }

    // setter for age.
    public void setAge(Integer age) {
        this.age = age;
    }

    // getter for email.
    public String getEmail() {
        if(email == ""){
            return "Name cannot be empty.";
        }
        return email;
    }

    // setter for email.
    public void setEmail(String email) {
        this.email = email;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Jasleen");
        System.out.println("Person name is: "+person.getName());
        person.setAge(23);
        System.out.println("Person age is: "+person.getAge());
        person.setEmail("jasleenkaur556677@gmail.com");
        System.out.println("Person email is: "+person.getEmail());
    }
}
