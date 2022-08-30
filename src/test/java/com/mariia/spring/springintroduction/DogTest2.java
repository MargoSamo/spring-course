package com.mariia.spring.springintroduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DogTest2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();

        context.close();

    }
}
