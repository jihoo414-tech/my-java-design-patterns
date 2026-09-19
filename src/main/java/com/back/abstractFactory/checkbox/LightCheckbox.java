package com.back.abstractFactory.checkbox;

public class LightCheckbox implements Checkbox{
    @Override
    public void render(){
        System.out.println("[Light] 밝은 테마 체크박스를 그립니다.");
    }
}
