package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static  int N = 3;

    public static void main(String[] args) {
      /*  Map<Integer, ArrayList> map = new HashMap<Integer, ArrayList>();
        ArrayList<Integer> r1 = new ArrayList<Integer>(N);
        ArrayList<Integer> r2 = new ArrayList<Integer>(N);
        ArrayList<Integer> r3 = new ArrayList<Integer>(N);
        ArrayList<Integer> ar = new ArrayList<Integer>();
*/
        int[][] arr = new int[N][N];
        generate_matrix(arr);
        display(arr);
        System.out.println();
        System.out.println("The sorted array by rows");

        int sum1, sum2;
        int t;
        int B = 1;

        do {
            B = 0;
            for (int i = 0; i < N - 1; i++) {
                sum1 = sum2 = 0;

                for (int j = 0; j < N; j++) {
                    sum1 += arr[i][j];
                    sum2 += arr[i + 1][j];
                }

                if (sum1 > sum2) {
                    B++;
                    for (int j = 0; j < N; j++) {
                        t = arr[i][j];
                        arr[i][j] = arr[i + 1][j];
                        arr[i + 1][j] = t;
                    }
                }
            }
        } while (B != 0);


        display(arr);




    }




    public static void generate_matrix(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }
    }





    public static void display(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");


            }
            System.out.println();
        }


    }





}