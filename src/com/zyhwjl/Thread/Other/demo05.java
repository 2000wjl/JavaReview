package com.zyhwjl.Thread.Other;

import com.zyhwjl.Thread.Other.Hero;

/**
 * author:jlwang7
 * Sleep
 * Join
 * 优先级
 */
public class demo05 {
    public static void main(String[] args) {
        Hero atk=new Hero();
        Hero h1 = new Hero();
        Hero h2 = new Hero();

        atk.name="盖伦";
        atk.hp=1000;
        atk.attk=1;

        h1.name="提莫";
        h1.hp=1000;
        h1.attk=1;

        h2.name="德玛";
        h2.hp=1000;
        h2.attk=1;

//        while(h1.noDead()){
//            atk.pk(h1);
//        }
//
//        while(h2.noDead()){
//            h1.pk(h2);
//        }

        Thread thread = new Thread(){
            @Override
            public void run() {
                while(h2.noDead()){
                    atk.pk(h2);
                }
            }
        };
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                while (h1.noDead()) {
                    h2.pk(h1);
                }
            }
        };
        thread.setPriority(Thread.MAX_PRIORITY);
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread.start();
        thread1.start();
    }
}
