package com.company;

public class Wolf extends Animal implements AttackerInterface {

    public Wolf(int age) {
        super(age, 400, "badboy", false, false, false, false);
    }
    @Override
    protected void sayHello() {
        System.out.println("Hihihihihi I'm a " + this.getClass().getSimpleName() + ". I have " + getHp() + " HP");
    }

    @Override
    protected void getDeathScream() {
        System.out.println(getClass().getSimpleName() + " said: \"I've just get rekted...\" And after it died");
    }

    @Override
    public int getCombatPoint() {
        int combatPower = 0;
        int attackMove = (int) (Math.random() * 3);
        if (attackMove == 1) {
            combatPower = 100;
            System.out.println("Wolf use super bite " + combatPower + " CP");
        } else if (attackMove == 2) {
            combatPower = 70;
            System.out.println("Wolf use claws " + combatPower + " CP");
        } else {
            combatPower = 50;
            System.out.println("Wolf use push " + combatPower + " CP");
        }
        return combatPower;
    }
}