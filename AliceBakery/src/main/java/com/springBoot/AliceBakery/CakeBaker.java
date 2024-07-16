package com.springBoot.AliceBakery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {

    @Autowired
    Frosting frostCake;
    @Autowired
    Syrup syrupCake;

    String bakeCake(){
        frostCake.getFrosting();
        syrupCake.getSyrup();
        return "Cake will be Baked";

    }
}
