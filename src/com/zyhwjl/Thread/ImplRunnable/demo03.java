package com.zyhwjl.Thread.ImplRunnable;

/**
 * author:jlwang7
 */
public class demo03 {
    public static void main(String[] args) {
        Hero atk=new Hero();
        Hero h1 = new Hero();
        Hero h2 = new Hero();

        atk.name="盖伦";
        atk.hp=100;
        atk.attk=8;

        h1.name="提莫";
        h1.hp=100;
        h1.attk=9;

        h2.name="德玛";
        h2.hp=100;
        h2.attk=7;

//        while(h1.noDead()){
//            atk.pk(h1);
//        }
//
//        while(h2.noDead()){
//            h1.pk(h2);
//        }

        KillThread killThread1 = new KillThread(atk, h1);
        new Thread(killThread1).start();
        KillThread killThread2 = new KillThread(h1, h2);
        new Thread(killThread2).start();
    }
}
