package com.company;

public class Main {

    public static void main(String[] args) {

        int N = 3;
        int[][] arr = new int[N][N];
        generate_matrix(arr);
        display(arr);
        System.out.println("The determinant equals" + determinant(arr, N));
    }

    public static int sum (int n){
        int sum=0;
        for (int i=0; i<n;i++){

         }

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