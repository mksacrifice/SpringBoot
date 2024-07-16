package com.springBoot.AliceBakery;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="cake.frost", havingValue = "chocolate")
public class ChocolateFrosting implements Frosting{

    @Override
    public void getFrosting() {
        System.out.println("Chocolate Frosting is on the way!!!");
    }
}
