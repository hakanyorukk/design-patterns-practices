package com.hakan.patterns.behavioral.strategy.duck;

import com.hakan.patterns.behavioral.strategy.fly.FlyNoWay;
import com.hakan.patterns.behavioral.strategy.quack.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
