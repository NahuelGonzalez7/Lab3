package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
// write your code here
        Scanner scan = new Scanner(System.in);

        //int N = 7;
        double A = 2.10;
        char C = 's';

        /*
        System.out.println(N);
        System.out.println(A);
        System.out.println(C);

        System.out.println("Suma de N + A:"+ (A+N));
        System.out.println("A-N: "+(A-N));
        System.out.println("Char --> "+(int)(C));
        */

        int X = 4;
        int Y = 5;
        double N = 3.22;
        double M = 4.69;

        System.out.println(" Resta de X - N:"+ (X-N));
        System.out.println(" Resta de M - N:"+ (M-N));
        System.out.println(" Suma de N + Y:"+ (N+Y));
        System.out.println(" Multiplicacion de X * N:"+ (X*Y));

    }



    public void Ejercicio1()
    {
        Scanner scan = new Scanner(System.in);

        int N;
        double A;
        char C;

        N = scan.nextInt();
        A = scan.nextDouble();
        C = 's';

        System.out.println(N);
        System.out.println(A);
        System.out.println(C);
    }
}