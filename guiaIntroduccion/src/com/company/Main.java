package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// write your code here
        Scanner scan = new Scanner(System.in);


//EJERCICIO 1
        /*
        int N = 7;
        double A = 2.10;
        char C = 's';


        System.out.println(N);
        System.out.println(A);
        System.out.println(C);

        System.out.println("Suma de N + A:"+ (A+N));
        System.out.println("A-N: "+(A-N));
        System.out.println("Char --> "+(int)(C));

//EJERCICIO 2

        int X = 4;
        int Y = 5;
        double N = 3.22;
        double M = 4.69;

        System.out.println(" Resta de X - N:"+ (X-N));
        System.out.println(" Resta de M - N:"+ (M-N));
        System.out.println(" Suma de N + Y:"+ (N+Y));
        System.out.println(" Multiplicacion de X * N:"+ (X*Y));

        //EJERCICIO 3

        int N = 20;
        System.out.println("Sumar 77 a N, N ahora es:"+ (N+77));
        System.out.println("Reducir N a 3, N ahora es:"+ (N-17));
        System.out.println("Duplicar el valor de N, N ahora es:"+ (N*2));


// EJERCICIO 4

        int A = 2;
        int B = 32;
        int C = 5;
        int D = 66;
        int Aux;

        Aux = B;
        B = C;
        C = A;
        A = D;
        D = Aux;

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
    */

        //EJERCICIO 5
        int A = 5;

        if (A % 2 == 0)
            {
                System.out.println("La variable es Par");
            }
        else
            {
                System.out.println("La variable es Impar");
            }

    }



    public void Ejercicio1() {
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