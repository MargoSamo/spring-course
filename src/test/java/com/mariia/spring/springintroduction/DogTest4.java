package com.mariia.spring.springintroduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DogTest4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.say();

        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.say();

        context.close();
    }
}
