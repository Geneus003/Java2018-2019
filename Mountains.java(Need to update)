package com.company;

        import com.sun.source.tree.ArrayAccessTree;

        import java.util.Arrays;
        import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner vvod = new Scanner(System.in);

        System.out.println("Введите ширину");
        int wht = vvod.nextInt();
        int moun[] = new int[wht];

        for (int i = 0; i < wht; i++){
            System.out.println("Высота рельефа на участке " + i);
            moun[i] = vvod.nextInt();
        }

        int end_con = 0;
        int con = 0;
        int maxx = moun[0];
        for (int i = 1; i < wht; i ++){
            if (moun[i] >= maxx){
                maxx = moun[i];
                end_con += con;
                con = 0;
            }
            else{
                con += maxx - moun[i];
            }
        }

        System.out.println(end_con);
    }
}
