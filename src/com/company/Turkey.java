package com.company;

public class Turkey extends Animal implements AttackerInterface{
    int attackPower;

    public Turkey(int age) {
        super(age, 150, "poultry", true, true, false, false);
    }
    @Override
    protected void sayHello() {
        System.out.println("Tru tru tru I'm a " + this.getClass().getSimpleName() + ". I have " + getHp() + " HP");
    }

    @Override
    protected void getDeathScream() {
        System.out.println(getClass().getSimpleName() + " said: \"Turbék turbék motherfucker...,\" and after it died");
    }

    @Override
    public int getCombatPoint() {
        int combatPower = 0;
        int attackMove = (int) (Math.random() * 3);
        if (attackMove == 1) {
            combatPower = 50;
            System.out.println("Turkey use super wing " + combatPower + " CP");
        } else if (attackMove == 2) {
            combatPower = 40;
            System.out.println("Turkey use claw " + combatPower + " CP");
        } else {
            combatPower = 30;
            System.out.println("Turkey use beak " + combatPower + " CP");
        }
        return combatPower;
    }
}