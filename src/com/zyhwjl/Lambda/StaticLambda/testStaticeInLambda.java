package com.zyhwjl.Lambda.StaticLambda;

/**
 * author:jlwang7
 */
public class testStaticeInLambda {
    public static boolean test(Hero h1){
        return h1.hp > 50;
    }

    public static Boolean test(com.zyhwjl.Lambda.JustLambda.Hero h) {        return h.hp > 50;

    }
}
