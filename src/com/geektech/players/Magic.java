package com.geektech.players;

import java.util.Random;

public class Magic extends Hero{

    public Magic(int health, int damage, String name,
                 EnumSuperAbility superAbility) {
        super(health, damage, name, superAbility);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random n = new Random();
        int N = n.nextInt(5 + 1);
        for (int i = 0; i <heroes.length ; i++) {
            if (getHealth() > 0 ){
                heroes[i].setDamage(heroes[i].getDamage() + N);
            }

        }
        System.out.println(getName()+ " increase atack to " + N);
    }
}
