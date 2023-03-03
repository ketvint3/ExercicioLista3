package Lista3Exercicios;

import java.util.Scanner;

public class DecimoSegundo {
    public static void main(String[] args) {
         Scanner imput = new Scanner( System.in);

        // Criando a matriz de temperaturas
        double[] temperaturas = new double[20];

        // Lendo as temperaturas
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Digite a temperatura " + (i+1) + ": ");
            temperaturas[i] = input.nextDouble();
        }

        // Calculando a menor temperatura
        double menor = temperaturas[0];
        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] < menor) {
                menor = temperaturas[i];
            }
        }

        // Calculando a maior temperatura
        double maior = temperaturas[0];
        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > maior) {
                maior = temperaturas[i];
            }
        }

        // Calculando a média das temperaturas
        double soma = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            soma += temperaturas[i];
        }
        double media = soma / temperaturas.length;

        // Apresentando os resultados
        System.out.println("Menor temperatura: " + menor);
        System.out.println("Maior temperatura: " + maior);
        System.out.println("Média das temperaturas: " + media);



        input.close();
        
    }
}
