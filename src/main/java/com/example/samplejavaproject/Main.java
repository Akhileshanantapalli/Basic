package com.example.samplejavaproject;

import com.example.samplejavaproject.Person;
import com.example.samplejavaproject.PersonService;

public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonService();

        // Create a new person
        Person person = new Person("John", "Doe", 30);
        personService.addPerson(person);

        // Retrieve and display the person
        Person retrievedPerson = personService.getPerson("John", "Doe");
        if (retrievedPerson != null) {
            System.out.println("Person found: " + retrievedPerson);
        } else {
            System.out.println("Person not found.");
        }
    }
}
