package com.back.abstractFactory.checkbox;

public class DarkCheckbox implements Checkbox{
    @Override
    public void render() {
        System.out.println("[Dark] 어두운 테마 체크박스를 그립니다.");
    }
}
