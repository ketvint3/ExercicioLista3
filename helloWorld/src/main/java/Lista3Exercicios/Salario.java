package Lista3Exercicios;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("informe o salario mensal");
        int Sm = input.nextInt();

        System.out.println("informe o persentual de reajuste");
        double Pr = input.nextDouble();

        double persentualDeReajuste = (Pr/100);

        System.out.println("o novo salario com aumento é:" + (Sm * (1 + persentualDeReajuste)));

        input.close();





    }
}
