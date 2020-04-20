package com.company;

public abstract class Animal extends Creature {

    protected String type;
    protected boolean domestic;
    protected boolean edible;
    protected boolean forFun;
    protected boolean forSecurity;
    protected boolean canFight;

    public Animal(int age, int hp, String type, boolean domestic, boolean edible, boolean forFun, boolean forSecurity) {
        super(age, hp);
        this.type = type;
        this.domestic = domestic;
        this.edible = edible;
        this.forFun = forFun;
        this.forSecurity = forSecurity;
        }


    public void setDomestic(boolean domestic) {
        this.domestic = domestic;
    }

    public void setEdible(boolean edible) {
        this.edible = edible;
    }

    public void setForFun(boolean forFun) {
        this.forFun = forFun;
    }

    public void setForSecure(boolean forSecurity) {
        this.forSecurity = forSecurity;
    }

    public void setType(String type) {
        this.type = type;
    }

}