package com.miranda.strategy.atacks;

import com.miranda.strategy.behavior.AtackBehavior;

public class FireKingdomAtack implements AtackBehavior {
    @Override
    public void basicAtack() {
        System.out.println("Ataque básico de Fogo!");
    }

    @Override
    public void specialAtack() {
        System.out.println("Grande Muralha Flamejante!");
    }
}
