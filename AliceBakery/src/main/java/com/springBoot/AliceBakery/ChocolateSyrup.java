package com.springBoot.AliceBakery;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="cake.syrup", havingValue = "chocolate")
public class ChocolateSyrup implements Syrup{

    @Override
    public void getSyrup() {
        System.out.println("Providing Choco syrup!!");

    }
}
