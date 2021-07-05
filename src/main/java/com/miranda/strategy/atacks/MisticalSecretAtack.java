package com.miranda.strategy.atacks;

import com.miranda.strategy.behavior.AtackBehavior;

public class MisticalSecretAtack implements AtackBehavior {
    @Override
    public void basicAtack() {
        System.out.println("Atack básico de magia!");
    }

    @Override
    public void specialAtack() {
        System.out.println("Super Ataque Místico Oculto!!");
    }
}
