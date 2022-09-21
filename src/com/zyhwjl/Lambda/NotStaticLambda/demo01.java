package com.zyhwjl.Lambda.NotStaticLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * author:jlwang7
 */
public class demo01 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Hero> heros = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("Hero" + i, random.nextInt(100), random.nextInt(1000)));
        }

        testNoStaticeInLambda testNoStaticeInLambda = new testNoStaticeInLambda();
        HeroChecker heroChecker = testNoStaticeInLambda::test;
        System.out.println("初始化：" + heros.toString());
        System.out.println("Lambda非静态：");
        for (Hero hero : heros) {
            if (heroChecker.test(hero)) {
                System.out.println(hero.toString());
            }
        }
    }
}
