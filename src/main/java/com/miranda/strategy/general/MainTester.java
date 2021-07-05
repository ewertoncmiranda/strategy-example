package com.miranda.strategy.general;

import com.miranda.strategy.StrategyExampleApplication;
import com.miranda.strategy.atacks.FireKingdomAtack;
import com.miranda.strategy.atacks.IceIslandAtack;
import com.miranda.strategy.atacks.MisticalSecretAtack;
import com.miranda.strategy.behavior.AtackBehavior;
import com.miranda.strategy.chars.FireWarrior;
import com.miranda.strategy.chars.IceMagician;
import com.miranda.strategy.chars.MagicianFairy;
import org.springframework.boot.SpringApplication;

public class MainTester {
    public static void main(String[] args) {

        Character char01 = new FireWarrior();

        FireKingdomAtack fire = new FireKingdomAtack() ;
        IceIslandAtack ice = new IceIslandAtack();
        AtackBehavior atack = new MisticalSecretAtack();

        char01.setAtack(fire);
        char01.performBasicAtack();
        char01.performSpecialAtack();

        char01.setAtack(ice);
        char01.performSpecialAtack();
        char01.performBasicAtack();

        char01.setAtack(atack);
        char01.performSpecialAtack();
        char01.performBasicAtack();

    }

}
