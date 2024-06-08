package com.example.samplejavaproject;

import com.example.samplejavaproject.Person;

import java.util.HashMap;
import java.util.Map;

public class PersonService {
    private Map<String, Person> personMap = new HashMap<>();

    public void addPerson(Person person) {
        String key = person.getFirstName() + " " + person.getLastName();
        personMap.put(key, person);
    }

    public Person getPerson(String firstName, String lastName) {
        String key = firstName + " " + lastName;
        return personMap.get(key);
    }
}
