package Lista3Exercicios;

import java.util.Scanner;

public class Fahrenheit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("informe o valor em celsius");
        double celsius = input.nextDouble();
        double fahrenheit = ( 9 * celsius + 160 ) /5;

        System.out.println("o resultado é:" + fahrenheit);

        input.close();

    }
}
