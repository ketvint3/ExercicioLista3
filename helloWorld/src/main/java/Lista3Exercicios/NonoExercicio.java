package Lista3Exercicios;

import java.util.Scanner;

public class NonoExercicio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int vlr = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        do {
            System.out.println(" informe o valor: " );
            vlr = input.nextInt();

            if(vlr > maior){
                maior = vlr;

            }
             if(vlr < menor) {
                 menor = vlr;
             }

            System.out.println(" maior valor " + maior);
            System.out.println(" menor valor " + menor);


        } while (vlr >=0);

        input.close();
    }
}
