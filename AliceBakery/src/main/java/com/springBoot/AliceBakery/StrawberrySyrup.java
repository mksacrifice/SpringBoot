package com.springBoot.AliceBakery;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="cake.syrup", havingValue = "strawberry")
public class StrawberrySyrup implements Syrup{
    @Override
    public void getSyrup() {
        System.out.println("Providing Strwaberry syrup!!");

    }
}
