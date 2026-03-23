package com.hakan.patterns.behavioral.strategy;

import com.hakan.patterns.behavioral.strategy.duck.Duck;
import com.hakan.patterns.behavioral.strategy.duck.MallardDuck;
import com.hakan.patterns.behavioral.strategy.duck.ModelDuck;
import com.hakan.patterns.behavioral.strategy.fly.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        // To change a duck's behavior at runtime,
        // just  call the duck's setter method for that behavior.
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
