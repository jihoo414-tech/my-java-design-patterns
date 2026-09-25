package com.back.prototype;

public class Main {
    public static void main(String[] args) {
        Monster prototype = new Monster("기본 오크",100,20);

        Monster monster1 = prototype.copy();
        Monster monster2 = prototype.copy();

        monster1.setName("오크1");
        monster2.setName("오크2");

        System.out.println(prototype);
        System.out.println(monster1);
        System.out.println(monster2);


    }
}
