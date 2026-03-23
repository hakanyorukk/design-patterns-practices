package com.hakan.patterns.behavioral.strategy.fly;

public class FlyWIthWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
