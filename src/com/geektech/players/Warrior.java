package com.geektech.players;

public class Warrior extends Hero{

    public Warrior(int health, int damage, String name,
                   EnumSuperAbility superAbility) {
        super(health, damage, name, superAbility);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        int rise = (int) (2 + Math.random()*4);
        boss.setHealth(boss.getHealth() - getDamage() * rise);
        System.out.println(getName()+ " rise to " + rise);
    }
}
