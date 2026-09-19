package com.back.abstractFactory.factory;

import com.back.abstractFactory.button.Button;
import com.back.abstractFactory.button.LightButton;
import com.back.abstractFactory.checkbox.Checkbox;
import com.back.abstractFactory.checkbox.LightCheckbox;

public class LightThemeFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LightCheckbox();
    }
}