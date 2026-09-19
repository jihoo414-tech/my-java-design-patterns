package com.back.abstractFactory;

import com.back.abstractFactory.factory.DarkThemeFactory;
import com.back.abstractFactory.factory.GUIFactory;
import com.back.abstractFactory.factory.LightThemeFactory;

public class Main {
    public static void main(String[] args){
        System.out.println("=== 다크 테마 적용 ===");
        GUIFactory factory = new DarkThemeFactory();
        Application app1 = new Application(factory);
        app1.renderUI();

        System.out.println("\n======================\n");

        System.out.println("=== 라이트 테마 적용 ===");
        GUIFactory lightFactory = new LightThemeFactory();
        Application app2 = new Application(lightFactory);
        app2.renderUI();


    }
}
