package com.company;

public class Cat extends Animal{

    public Cat(int age) {
        super(age, 200, "goodgirl", true, false, true, false);
    }
    @Override
    protected void sayHello() {
        System.out.println("Miau I'm a " + this.getClass().getSimpleName() + ". I have " + getHp() + " HP");
    }

    @Override
    protected void getDeathScream() {
        System.out.println(getClass().getSimpleName() + " said: \"I have some life left\". And after it died");    }

}