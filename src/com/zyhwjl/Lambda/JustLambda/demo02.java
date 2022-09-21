package com.zyhwjl.Lambda.JustLambda;

import java.util.*;

/**
 * author:jlwang7
 */
public class demo02 {
    public static void main(String[] args) {
        Comparator<Hero> comparator = (Hero o1, Hero o2) ->{
                if(o1.hp>o2.hp){
                    return 1;
                }else {
                    return -1;
                }
            };


        Comparator<Hero> comparator1 = (o1,o2) ->o1.hp>o2.hp?1:-2;



        List<Hero> heros=new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("Hero"+i,random.nextInt(100),random.nextInt(1000)));
        }
        System.out.println(heros);
        Collections.sort(heros,comparator);

        System.out.println("排序："+heros);
        Collections.sort(heros,comparator1);

        System.out.println("Lambda排序："+heros);
    }
}
