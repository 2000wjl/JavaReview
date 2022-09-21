package com.zyhwjl.Thread.InsidClass;

/**
 * 英雄类
 * author:jlwang7
 */
public class Hero {
    public String name;
    public int hp;
    public int attk;

    public void pk(Hero attdH){
        attdH.hp=attdH.hp-attk;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name+"攻击"+attdH.name+",攻击力："+attk+",剩余血量："+attdH.hp);
        if(!attdH.noDead()){
            System.out.println(attdH.name+"死了");
        }
    }

    public Boolean noDead(){
        return hp > 0;
    }
}
