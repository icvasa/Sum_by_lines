package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static  int N = 3;

    public static void main(String[] args) {
        Map<Integer, ArrayList> row1 = new HashMap<Integer, ArrayList>();
        ArrayList<Integer> r1 = new ArrayList<Integer>(N);
        Map<Integer, ArrayList> row2 = new HashMap<Integer, ArrayList>();
        ArrayList<Integer> r2 = new ArrayList<Integer>(N);
        Map<Integer, ArrayList> row3 = new HashMap<Integer, ArrayList>();
        ArrayList<Integer> r3 = new ArrayList<Integer>(N);

        int[][] arr = new int[N][N];
        generate_matrix(arr);
        display(arr);
        int sum;

        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");


                sum += arr[i][j];


            }
            System.out.print("= " + sum+"\n");

        }


        /*for (int i = 0; i < arr.length; i++) {
            Map<Integer,ArrayList>  de = new Map<Integer, ArrayList>;
        }


    }
*/


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