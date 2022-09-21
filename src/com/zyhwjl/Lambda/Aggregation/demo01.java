package com.zyhwjl.Lambda.Aggregation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**
 * author:jlwang7
 */
public class demo01 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Hero> heros = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            heros.add(new Hero("Hero"+i,random.nextInt(100),random.nextInt(1000)));
        }

        System.out.println(heros);

        Comparator<Hero> comparator = new Comparator<Hero>() {

            @Override
            public int compare(Hero o1, Hero o2) {
                return o1.hp > o2.hp ? 1 : -1;
            }
        };

        heros
                .stream()
                .limit(3)
                .filter(Hero::matched)
                .forEach(System.out::println);
    }
}
