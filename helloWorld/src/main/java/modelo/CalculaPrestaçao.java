package modelo;

import java.util.Scanner;

public class CalculaPrestaçao {

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

       System.out.println("imforme o valor");
      double valor = input.nextDouble();
      System.out.println("imforme a taxa");
      double taxa = input.nextDouble();
      System.out.println("informe o tempo");
      int tempo= input.nextInt();
      System.out.println("o resultado é:");
      double prestaçao = valor + (valor * (taxa/100) * tempo);
       System.out.println(prestaçao);




       input.close();
        }
    }


