package com.back.abstractFactory.factory;

import com.back.abstractFactory.button.Button;
import com.back.abstractFactory.checkbox.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
