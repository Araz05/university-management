package main;

import java.time.LocalDate;
import java.util.Date;

import model.person.Person;

public class Main {
    public static void main(String[] args) {
        LocalDate dob = LocalDate.of(2000, 5, 15);
       Person p1 = new Person(61, "aoru",LocalDate.now());
        Person p2 = new Person(2, "dad","dakdjaa","adjkjda", "asljd" ,dob);
        System.out.println(p2);
    }
}
