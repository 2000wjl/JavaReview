package com.zyhwjl.Lambda.ImportObjectMethod;

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

    public boolean matched(){
        return hp>50;
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
