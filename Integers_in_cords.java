package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner vvod = new Scanner(System.in);

        System.out.println("Координата 1 х");
        int x1 = vvod.nextInt();
        System.out.println("Координата 1 у");
        int y1 = vvod.nextInt();
        System.out.println("Координата 2 х");
        int x2 = vvod.nextInt();
        System.out.println("Координата 2 у");
        int y2 = vvod.nextInt();

        if ((x2 == x1) || (y2 == y1)){
            System.out.println("Unreal");
            return;
        }

        int d_y = Math.max(y1, y2) - Math.min(y1, y2);
        int d_x = Math.max(x1, x2) - Math.min(x1, x2);

        float v = (float)d_y/(float)d_x;

        //System.out.println(v + " " + v%1);

        int close_in = 0;
        float pr_v = v;

        while (v % 1 != 0){
            v += pr_v;
            //System.out.println(v);
        }
        close_in = (int)v;

        //System.out.println(close_in);

        if(close_in > d_y){
            System.out.println("2");
        }
        else{
            System.out.println(d_y / close_in + 1);
        }

    }
}
