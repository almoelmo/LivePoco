package org.example.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Bug {

    private Bird bird;

    //внедрение через setter
    @Autowired
    public void setBird(Bird bird) {
        this.bird = bird;
    }

    @Override
    public String toString() {
        return "жучка съела птичка," + bird.toString();
    }
}
