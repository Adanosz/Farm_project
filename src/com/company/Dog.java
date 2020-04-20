package com.company;

public class Dog extends Animal implements AttackerInterface{
    public Dog(int age) {
        super(age, 500, "goodboy", true, false, true, true);
    }

    @Override
    protected void sayHello() {
        System.out.println("Wau wau I'm a " + this.getClass().getSimpleName() + ". I have " + getHp() + " HP");
    }

    @Override
    protected void getDeathScream() {
        System.out.println(getClass().getSimpleName() + " said: \"Sugar Honey Ice Tea...\" and after it died");
    }

    @Override
    public int getCombatPoint() {
        int combatPower = 0;
        int attackMove = (int) (Math.random() * 3);
        if (attackMove == 1) {
            combatPower = 100;
            System.out.println("Dog use super bite " + combatPower + " CP");
        } else if (attackMove == 2) {
            combatPower = 70;
            System.out.println("Dog use normal bite " + combatPower + " CP");
        } else {
            combatPower = 50;
            System.out.println("Dog use push " + combatPower + " CP");
        }
        return combatPower;
    }
}