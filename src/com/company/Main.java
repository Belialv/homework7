package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int dog = x.nextInt();
        int cat = x.nextInt();
        int cost = x.nextInt();
        int days = x.nextInt();
        int eat = x.nextInt();
        int resault = eatFunctioncat(cat, eat, days);
        int resault1 = eatFunctiondog(dog, eat, days);
        System.out.println("cost:" + ((resault + resault1) / 50) * 2);

    }

    public static int eatFunctioncat(int cat, int eat, int days) {
        System.out.println("Для такого количества котов" + cat + " надо грамм корма:" + (eat * cat * days));
        return cat;
    }

    public static int eatFunctiondog(int dog, int eat, int days) {
        System.out.println("Для такого количества собак" + dog + " надо грамм корма:" + (eat * days));
        return dog;
    }
}
