package com.back.abstractFactory.factory;

import com.back.abstractFactory.button.Button;
import com.back.abstractFactory.button.DarkButton;
import com.back.abstractFactory.checkbox.Checkbox;
import com.back.abstractFactory.checkbox.DarkCheckbox;

public class DarkThemeFactory implements GUIFactory{
    @Override
    public Button createButton(){
        return new DarkButton();
    }
    @Override
    public Checkbox createCheckbox(){
        return new DarkCheckbox();
    }

}
