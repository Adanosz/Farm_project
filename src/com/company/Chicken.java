package com.company;

public class Chicken extends Animal{
    public Chicken(int age) {
        super(age, 100,  "poultry", true, true, false, false);
    }
    @Override
    protected void sayHello() {
        System.out.println("Kot kot I'm a " + this.getClass().getSimpleName() + ". I have " + getHp() + " HP");
    }

    @Override
    protected void getDeathScream() {
        System.out.println(getClass().getSimpleName() + " said: \"csiphhhhhhhhhhhh...\" and after it died");
    }
}
