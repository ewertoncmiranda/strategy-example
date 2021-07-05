package com.miranda.strategy.general;

import com.miranda.strategy.behavior.AtackBehavior;
import com.miranda.strategy.behavior.DefenseBehavior;

public abstract class Character {

    public Character(){}

    public String getName() {
        return name;
    }

    String name;
    AtackBehavior atack;
    DefenseBehavior defense;

    public void performBasicAtack(){
        atack.basicAtack();
    }

    public void performSpecialAtack(){
        atack.specialAtack();
    }

    public void performBasicDefense(){
        defense.basicDefense();
    }

    public void performSpecialDefense(){
        defense.specialDefense();
    }


    public void setName(String name) {
        this.name = name;
    }

    public AtackBehavior getAtack() {
        return atack;
    }

    public void setAtack(AtackBehavior atack) {
        this.atack = atack;
    }

    public DefenseBehavior getDefense() {
        return defense;
    }

    public void setDefense(DefenseBehavior defense) {
        this.defense = defense;
    }





}
