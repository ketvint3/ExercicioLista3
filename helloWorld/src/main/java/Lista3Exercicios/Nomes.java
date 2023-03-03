package Lista3Exercicios;

import java.util.Scanner;

public class Nomes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
         String[] nomes = new String[10];

        for (int i = 0; i < 10; i++) {

            System.out.println(" informe o nome " + (i + 1) + ": ");
           nomes [i] = input.nextLine();


        }
            System.out.println(" os nomes digitados foram: ");

        for (int i = 0; i < 10; i++) {
            System.out.println( nomes[i] + ": " + (i+1));

        }















        input.close();
    }
}
