package com.company;

import com.sun.source.tree.ArrayAccessTree;

import java.util.Arrays;
import java.util.Scanner;

public class Main{




    public static void main(String[] args) {

        Scanner vvod = new Scanner(System.in);

        System.out.println("Введите количество деревень");

        int n = vvod.nextInt();

        System.out.println("Введите пункты назначения");
        int d = vvod.nextInt();
        int v = vvod.nextInt();

        if (d == v){
            System.out.println("IMPOSSIBLE");
            return;
        }

        System.out.println("Введите количество маршурутов");

        int r = vvod.nextInt();
        int[][] matrix = new int[r][4];

        boolean isItReal1 = false;
        boolean isItReal2 = false;

        for(int i = 0; i < r; i++){
            int temp1 = vvod.nextInt();
            int temp2 = vvod.nextInt();
            int temp3 = vvod.nextInt();
            int temp4 = vvod.nextInt();

            if (temp1 == d){
                isItReal1 = true;
            }
            if (temp3 == v){
                isItReal2 = true;
            }

            matrix[i][0] = temp1;
            matrix[i][1] = temp2;
            matrix[i][2] = temp3;
            matrix[i][3] = temp4;

        }

        if ((isItReal1 == false) || (isItReal2 == false)){
            System.out.println("IMPOSSIBLE");
            return;
        }
        
        int abs_min = 1000000000;
        for (int i = 0; i < r; i++)
            if (matrix[i][0]  == d) {
                int us_town[] = new int[r];
                int min_road = find_road(d, v, matrix[i][3], us_town, matrix, matrix[i][3] - matrix[i][1]);
                if (min_road < abs_min){
                    abs_min = min_road;
                }
            }
        
        System.out.println(abs_min);



    }

    public static int find_road(int f_t, int s_t, int n_s_t, int[] us_matrix, int matrix[][], int us_time){
        
        
        
        
        return 0;
    }

}
