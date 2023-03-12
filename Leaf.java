package org.example.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Leaf {

    //внедрение через поле
    @Autowired
    private Bug bug;

    @Override
    public String toString() {
        return "Листик съел жучок," + bug.toString();
    }
}
