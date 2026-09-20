package com.back.flyweight;

public class TreeType {
    private final String name;
    private final String color;
    //아주 큰 용량의 그래픽 데이터라고 가정
    private final String textureData;

    public TreeType(String name, String color, String textureData) {
        this.name = name;
        this.color = color;
        this.textureData = textureData;
        System.out.println("🌲 [메모리 생성] 새로운 TreeType 객체 생성: " + name);
    }

    public void draw(int x, int y) {
        System.out.println("나무 그려짐 -> [종류: " + name + ", 색상: " + color + "] 위치: (" + x + ", " + y + ")");
    }
}
