package com.springBoot.AliceBakery;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="cake.frost", havingValue = "strawberry")
public class StrawberryFrosting implements Frosting{

    @Override
    public void getFrosting() {
        System.out.println("Strawberry Frosting is on the way!!!");
    }

}
