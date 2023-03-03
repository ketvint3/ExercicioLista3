package Lista3Exercicios;

import java.util.Scanner;


public class MatrizABC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] A = new int[15];
        int[] B = new int[15];
        int[] C = new int[30];

        for (int i = 0; i < A.length; i++) {
            A[i] = i;
            System.out.println(" inform a matriz A " + i + " : " + A[i]);
            
            
        }
        System.out.println( "       ");

        for (int i = 0; i < B.length; i++) {
            B[i] = i;
            System.out.println("informe a matriz B" + i + " : " + B[i]);


            
        }
        for (int i = 0; i < 15; i++) {
            C[i] = A[i];
            C[i + 15] = B[i];


        }

        System.out.println( "     ");

        for (int i = 0; i < 30; i++) {

            System.out.println(" valores " + C[i]);


        }

        input.close();
    }
}
