package Lista3Exercicios;

import java.util.Scanner;

public class AntecessorESucessor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("informe o valor numerico");
        double dez = input.nextDouble();
         double onze = (dez+1);
        System.out.println("este é o valor sucessor" + onze);;
        double nove = (dez-1);
        System.out.println("este é o valor antecessor" + nove);



        input.close();




    }
}
