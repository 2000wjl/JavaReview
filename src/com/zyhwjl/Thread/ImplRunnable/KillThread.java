package com.zyhwjl.Thread.ImplRunnable;

/**
 * author:jlwang7
 */
public class KillThread implements Runnable {
    private Hero h1;
    private Hero h2;

    public KillThread(Hero atk, Hero h1) {
        this.h1=atk;
        this.h2=h1;
    }

    public void run (){
        while(h2.noDead()){
            h1.pk(h2);
        }
    }
}
