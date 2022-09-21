package com.zyhwjl.Lambda.JustLambda;

/**
 * author:jlwang7
 */
public class Hero {
    public String name;
    public int hp;
    public int atk;

    public Hero(String name,int hp, int atk){
        this.name=name;
        this.hp=hp;
        this.atk=atk;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "hp=" + hp +
                ", atk=" + atk +
                '}';
    }
}
