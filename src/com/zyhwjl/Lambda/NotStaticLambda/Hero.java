package com.zyhwjl.Lambda.NotStaticLambda;

/**
 * author:jlwang7
 */
public class Hero {
    public String name;
    public int hp;
    public int atk;
    public Hero(String name,int hp,int atk){
        this.atk=atk;
        this.hp=hp;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", atk=" + atk +
                '}';
    }
}
