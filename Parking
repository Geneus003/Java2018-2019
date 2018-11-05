package com.company;

import com.sun.source.tree.ArrayAccessTree;

import java.util.Arrays;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner vvod = new Scanner(System.in);

        System.out.println("Плата за 28");
        int a = vvod.nextInt();
        System.out.println("Плата за неделю");
        int b = vvod.nextInt();
        System.out.println("Плата за день");
        int min_day = vvod.nextInt();
        System.out.println("Количество дней");
        int days = vvod.nextInt();

        if ((a < 0) || (b < 0) || (min_day < 0) || (days <= 0)){
            System.out.println("Unreal");
            return;
        }

        int min_month = a;
        int min_week = b;
        int abs_min1, abs_min2, abs_min = 1000000;

        abs_min1 = Math.min(min_day*7, min_week);
        abs_min2 = Math.min(min_day*28, min_week*4);
        abs_min1 = Math.min(abs_min1*4, abs_min2);
        int abs_min_month = Math.min(abs_min1, min_month);
        int abs_min_day = min_day;
        int abs_min_week = Math.min(min_day*7, min_week);

        abs_min_week = Math.min(abs_min_month,abs_min_week);
        abs_min_day = Math.min(abs_min_week, abs_min_day);


        System.out.println(abs_min_month + " " + abs_min_week + " " + abs_min_day);
        System.out.println("--------------------");




        int paid = 0;
        while(days > 0){
            System.out.println(days+ " " + paid);
            if (days >= 28){
               days -= 28;
               paid += abs_min_month;
               continue;
            }
            if (days > 7){
                if (abs_min_month > abs_min_week*Math.round(days / 7)){
                    paid += abs_min_week;
                    days -= 7;
                    continue;
                }
                else{
                    paid += abs_min_week;
                    days -= 28;
                    continue;
                }

            }
            else{
                if (abs_min_day*days < abs_min_week){
                    paid += abs_min_day;
                    days -= 1;
                    continue;
                }
                else{
                    paid += abs_min_week;
                    days -= 7;
                    continue;
                }
            }


        }
        System.out.println(paid);

    }
}
