package com.zyhwjl.Lambda.JustLambda;

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
            heros.add(new Hero("Hero"+i,random.nextInt(100),random.nextInt(1000)));
        }
        System.out.println("初始化集合:"+heros.toString());
        System.out.println("hp>50 atk>500:");
        for (Hero hero:heros) {
            if(hero.hp>50&&hero.atk>500){
                System.out.println(hero);
            }
        }
        HeroChecker heroChecker = new HeroChecker() {
            @Override
            public Boolean test(Hero h) {
                return h.hp > 50 && h.atk > 500;
            }
        };
        System.out.println("内部方法类：");
        for (Hero hero:heros) {
            if(heroChecker.test(hero)){
                System.out.println(hero);
            }
        }

        HeroChecker heroChecker1 = (Hero h)-> {
                return h.hp > 50 && h.atk > 500;
            };
        System.out.println("简化内部类");
        for (Hero hero:heros) {
            if (heroChecker1.test(hero)) {
                System.out.println(hero);
            }
        }

        HeroChecker heroChecker2 = (Hero h)->
             h.hp > 50 && h.atk > 500;

        System.out.println("简化2内部类");
        for (Hero hero:heros) {
            if (heroChecker2.test(hero)) {
                System.out.println(hero);
            }
        }

        HeroChecker heroChecker3 = h->
                h.hp > 50 && h.atk > 500;

        System.out.println("简化3内部类");
        for (Hero hero:heros) {
            if (heroChecker3.test(hero)) {
                System.out.println(hero);
            }
        }
    }
}

