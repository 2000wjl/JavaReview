package com.zyhwjl.Lambda.ImportObjectMethod;

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

        System.out.println(heros);

        HeroChecker heroChecker = Hero::matched;

        for (Hero hero:heros) {
            if(heroChecker.test(hero)){
                System.out.println(hero);
            }
        }
    }
}
