package com.back.abstractFactory.button;

public class DarkButton implements Button{
    public void render() {
        System.out.println("[Dark] 검은색 바탕의 버튼을 그립니다.");
    }
}
