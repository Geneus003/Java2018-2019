package com.company;

        import com.sun.source.tree.ArrayAccessTree;

        import java.util.Arrays;
        import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner vvod = new Scanner(System.in);

        System.out.println("Введите ширину");
        int wht = vvod.nextInt();
        int matrix[] = new int[wht];

        for (int i = 0; i < wht; i++){
            System.out.println("Высота рельефа на участке " + i);
            matrix[i] = vvod.nextInt();
        }

        int passed = -1, zerno = -1;
        int min_l = -1, cord1 = -1;
        int min_r = -1, cord2 = -1;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < wht; j++) {

                if (j == passed){
                    continue;
                }
                if (matrix[j] > min_l){
                    min_l = matrix[j];
                    cord1 = j;
                    zerno = j;
                    continue;
                }
                if ((matrix[j] >= min_r) && (passed != -1)){
                    cord2 = j;
                    min_r = matrix[j];
                }

            }
            passed = zerno;
        }

        int s = 0;
        for(int i = cord1 + 1; i < cord2; i++){
            s += Math.min(cord1, cord2);
        }

        s += find_to_towns_l(cord1, 0, matrix, wht);
        System.out.println("______________");
        s += find_to_towns_r(wht - 1, cord2, matrix, wht-1);

        System.out.println(s);
    }

    public static int find_to_towns_l(int cord_min_r, int cord_min_l, int[] matrix, int wht){

        wht -= 1;

        if ((cord_min_r == 0) && (cord_min_l == 0)){
            return 0;
        }

        int max_v = -1;
        int cor = -1;
        int con = 0;

        for(int i = cord_min_l; i < cord_min_r; i++){
            if (matrix[i] > max_v)
                max_v = matrix[i];
                cor = i;
        }

        for(int i = cor; i < cord_min_r; i++){
            if (max_v - matrix[i] < 0){
                continue;
            }
            con += max_v - matrix[i];
        }

        con += (find_to_towns_l(cor, 0, matrix, wht));

        return con;
    }

    public static int find_to_towns_r(int cord_min_r, int cord_min_l, int[] matrix, int wht){

        if (((cord_min_r == wht) && (cord_min_l == wht)) ){
            return 0;
        }

        int max_v = -1;
        int cor = -1;
        int con = 0;

        for(int i = cord_min_l + 1; i <= cord_min_r; i++){
            if (matrix[i] > max_v)
                max_v = matrix[i];
                cor = i;
        }

        for(int i = cord_min_l; i < cor; i++) {
            if (max_v - matrix[i] < 0) {
                continue;
            }
            con += max_v - matrix[i];
        }

        con += (find_to_towns_r(wht, cor, matrix, wht));

        return con;
    }
}
