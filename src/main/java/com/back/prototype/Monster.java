package com.back.prototype;

public class Monster extends Prototype<Monster>{
    private String name;
    private int hp;
    private int attack;

    public Monster(String name, int hp, int attack){
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Monster{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", attack=" + attack +
                '}';
    }
}
