package repeticao;

import java.util.Scanner;

public class repeticaoModelo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("informe o valor da tabuada");
         int numeroDaTabuada = input.nextInt();

         for (int contador=1; contador<=10; contador++ ) {

             int valorResultado = numeroDaTabuada * contador;
             System.out.println(numeroDaTabuada + "*" +contador+ "="+ valorResultado );

             input.close();
         }

    }
}
