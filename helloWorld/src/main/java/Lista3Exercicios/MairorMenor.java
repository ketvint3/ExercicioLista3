package Lista3Exercicios;

import java.util.Scanner;

public class MairorMenor {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("informe os valores");

        int valorA = input.nextInt();
        int valorB = input.nextInt();

        System.out.println(valorA-valorB);

        input.close();


    }
}
