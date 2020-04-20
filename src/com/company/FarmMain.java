package com.company;

public class FarmMain {

    public static void main(String[] args) {
        Creature[] creatures = getRandomCreature(100);
        while (stillAlive(creatures)) {
            nextEvent(creatures);
            System.out.println("******************************************");
        }
    }


    public static Creature[] getRandomCreature(int numOfCreatures) {
        Creature[] creatures = new Creature[numOfCreatures];
        for (int i = 0; i < numOfCreatures; i++) {
            int r = (int) (Math.random() * 100);
            if (r < 60) {
                creatures[i] = new Chicken(3);
            } else if (r < 65) {
                creatures[i] = new Turkey(3);
            } else if (r < 70) {
                creatures[i] = new Cat(4);
            } else if (r < 80) {
                creatures[i] = new Dog(5);
            } else {
                creatures[i] = new Wolf(6);
            }
        }
        return creatures;
    }

    public static void nextEvent(Creature[] creatures) {
        int attacker = selectAttacker(creatures);
        int victim = selectLiveVictim(creatures);

        attack((Wolf) creatures[attacker], (Animal) creatures[victim]);
    }

    public static boolean stillAlive(Creature[] creatures) {
        return wolfAlive(creatures) && notWolfAlive(creatures);
    }

    private static boolean notWolfAlive(Creature[] creatures) {
        for (Creature creature : creatures) {
            if ((!(creature instanceof Wolf)) && creature.isLive()) return true;
        }
        return false;
    }

    public static boolean wolfAlive(Creature[] creatures) {
        for (Creature creature : creatures) {
            if (creature instanceof Wolf && creature.isLive()) return true;
        }
        return false;
    }

    public static int randomCreature(int length) {
        return (int) (Math.random() * length);
    }

    public static int selectAttacker(Creature[] creatures) {
        int max = creatures.length;
        int i = randomCreature(max);
        while (!(creatures[i] instanceof Wolf && creatures[i].isLive())) {
            i = randomCreature(max);
        }
        return i;
    }

    public static int selectLiveVictim(Creature[] creatures) {
        int max = creatures.length;
        int i = randomCreature(max);
        while (!(!(creatures[i] instanceof Wolf) && creatures[i].isLive())) {
            i = randomCreature(max);
        }
        return i;
    }

    public static void attack(Wolf attacker, Animal poorAnimal) {
        attacker.sayHello();
        poorAnimal.sayHello();
        if (poorAnimal.isLive()) {
            if (!(poorAnimal instanceof AttackerInterface)) {
                poorAnimal.setHp(0);
            }
            while (poorAnimal.getHp() > 0 && attacker.getHp() > 0) {
                poorAnimal.setHp(poorAnimal.getHp() - attacker.getCombatPoint());
                if (poorAnimal.getHp() > 0) {
                    System.out.println(poorAnimal.getClass().getSimpleName() + " have " + poorAnimal.getHp() + " HP left");
                }
                if ((poorAnimal.isLive()) && (poorAnimal instanceof AttackerInterface)) {
                    AttackerInterface ai = (AttackerInterface) poorAnimal;
                    attacker.setHp(attacker.getHp() - ai.getCombatPoint());
                    if (attacker.getHp() > 0) {
                        System.out.println(attacker.getClass().getSimpleName() + " have " + attacker.getHp() + " HP left");
                    }
                }
            }
        }
    }
}