package Lista3Exercicios;

import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                System.out.println("informe o valor numerico");
                double valorNumerico = input.nextDouble();

                if(valorNumerico < 0);
                valorNumerico = valorNumerico *( - 1 );

                System.out.println("numero transformado em positivo é:" + valorNumerico);

                input.close();
    }
}
