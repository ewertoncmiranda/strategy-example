package com.miranda.strategy.atacks;

import com.miranda.strategy.behavior.AtackBehavior;

public class IceIslandAtack implements AtackBehavior {
    @Override
    public void basicAtack() {
        System.out.println("Atack básico de gelo!");
    }

    @Override
    public void specialAtack() {
        System.out.println("Execução Auroraaaa!!!");
    }
}
