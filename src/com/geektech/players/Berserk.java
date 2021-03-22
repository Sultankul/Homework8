package com.geektech.players;

import java.util.Random;

public class Berserk extends Hero{

    public Berserk(int health, int damage, String name,
                   EnumSuperAbility superAbility) {
        super(health, damage, name, superAbility);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        int min = 0;
        int max = 50;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min;
       boss.setHealth(boss.getHealth()-i);
       System.out.println(getName()+ " super ability damage " + i );


        }
    }

