package arrays;

import java.util.Scanner;

public class ArrayModelo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println(" informe o valor do elemento " + (i+1));
            A [i] = input.nextInt();

        }

        for (int i = 0; i < 10; i++) {
            B[i] = A[i] / 2;

        }
        for (int i = 0; i < 10; i++) {
            System.out.println(" Valores dos arrys A e B, na posiçao:" + (i+1));
            System.out.println( A[i] + " | " + B[i]);

        }












        input.close();
    }
}
