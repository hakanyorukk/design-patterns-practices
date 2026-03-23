package com.hakan.patterns.behavioral.strategy.duck;

import com.hakan.patterns.behavioral.strategy.fly.FlyWIthWings;
import com.hakan.patterns.behavioral.strategy.quack.Quack;

public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWIthWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
