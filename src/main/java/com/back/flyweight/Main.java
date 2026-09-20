package com.back.flyweight;

public class Main {
    public static void main(String[] args){
        System.out.println("=== 10,000개의 나무 생성 시도 ===");


        for (int i = 0; i < 5000; i++) {
            TreeType pineType = TreeFactory.getTreeType("소나무", "초록색", "소나무_메모리_크래픽_데이터");
            Tree pine = new Tree(i * 2, i * 3, pineType);

            TreeType mapleType = TreeFactory.getTreeType("단풍나무", "빨간색", "단풍나무_메모리_그래픽_데이터");
            Tree maple = new Tree(i * 3, i * 5, mapleType);
        }
        System.out.println("\n=== 결과 ===");
        System.out.println("생성된 총 나무 개수: 10,000개");
        System.out.println("실제 메모리에 올라간 TreeType 객체 수: " + TreeFactory.getCreatedObjectCount() + "개");


    }
}
