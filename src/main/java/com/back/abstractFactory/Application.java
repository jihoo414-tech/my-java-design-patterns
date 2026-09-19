package com.back.abstractFactory;

import com.back.abstractFactory.button.Button;
import com.back.abstractFactory.checkbox.Checkbox;
import com.back.abstractFactory.factory.GUIFactory;

public class Application {
    private final Button button;
    private final Checkbox checkbox;
    public Application(GUIFactory factory){
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }
    public void renderUI(){
        button.render();
        checkbox.render();
    }
}
