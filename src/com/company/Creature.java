package com.company;

public abstract class Creature {
    protected int age;
    protected int hp;
    protected boolean live;

    public Creature(int age, int hp) {
        this.age = age;
        this.hp = hp;
        this.live = true;
    }

    protected abstract void getDeathScream();

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp <= 0) {
            hp = 0;
            setLive(false);
            getDeathScream();
        }
        this.hp = hp;
    }

    protected void sayHello() {
        System.out.println("Hali, I'm a " + this.getClass().getSimpleName());
    }


    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }


}