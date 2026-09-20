package com.back.flyweight;

public class Tree {

    private final int x;
    private final int y;
    private final TreeType type; // 공유되는 Flyweight 객체를 참조만 함!

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw() {
        type.draw(x, y);
    }
}
