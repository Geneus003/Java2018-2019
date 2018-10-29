package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner vvod = new Scanner(System.in);

        System.out.println("Число танцоров");
        int p = vvod.nextInt();
        System.out.println("Номер главного");
        int n = vvod.nextInt();
        System.out.println("Число движений");
        int r = vvod.nextInt();

        if ((p <= 0) || (n <= 0) || (r < 0) || (n > p) || (p % 2 == 1)){
            System.out.println("Not real");
            return;
        }

        while(r >= p){
            r -= p;
        }

        if (r == 0){
            if (n + 1 > p){
                System.out.println("1" + " " + (n-1));
                return;
            }
            if (n - 1 == 0){
                System.out.println(p + " " + (n+1));
                return;
            }
            System.out.println((n + 1) + " " + (n - 1));
            return;
        }

        int r_neib = 0;
        int l_neib = 0;

        if (n == 1) {
            r_neib = p;
            l_neib = n + 1;
        }
        if (n == p){
            r_neib  = 1;
            l_neib = n - 1;
        }
        if (r_neib == 0){
            r_neib = n + 1;
            l_neib = n - 1;
        }
        //System.out.println(r_neib + " " + l_neib);
        for(int i = 0; i < r; i++){

            if (n % 2 == 0){
                for (int j = 0; j < 2; j++) {
                    r_neib -= 1;
                    l_neib -= 1;

                    if (r_neib < 1) {
                        r_neib = p;
                    }
                    if (l_neib < 1) {
                        l_neib = p;
                    }
                    //System.out.println(r_neib + " " + l_neib);


                }
            }
            else {

                for (int j = 0; j < 2; j++) {
                    r_neib += 1;
                    l_neib += 1;

                    if (r_neib > p) {
                        r_neib = 1;
                    }
                    if (l_neib > p) {
                        l_neib = 1;
                    }
                    //System.out.println(r_neib + " " + l_neib);


                }
            }
        }
        System.out.println(l_neib + " " + r_neib);
    }
}