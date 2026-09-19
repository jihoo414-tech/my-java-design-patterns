package com.back.abstractFactory.button;

public class LightButton implements Button{
    @Override
    public void render(){
        System.out.println("[Light] 하얀색 테두리의 버튼을 그립니다.");
    }
}
