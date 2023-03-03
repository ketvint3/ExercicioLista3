package Lista3Exercicios;

import java.util.Scanner;

public class DecimoQuarto {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);


    System.out.println("Lendo Valores da Matriz A! ");
    System.out.println("Permitidos valores divisíveis por 2 ou 3! ");
    System.out.println("Informe um valor para matriz A: ");


    int[] A = new int[12];
    int[] B = new int[12];
    int[] C = new int[24];

    for (int i = 0; i < A.length;) {
        int NM = input.nextInt();
        if ((NM %2 == 0) || (NM %3 == 0)) {
            A[i] = NM;
            C[i] = A[i];
            i++;
        } else {
            System.out.println("Valor inválido! ");
        }

    }


    System.out.println("Lendo Valores da Matriz B ");
    System.out.println("Permitidos valores múltiplos de 5 ");
    System.out.println("Informe um valor para matriz B: ");


    for (int i = 0; i < 12;) {
        int NM = input.nextInt();
        if (NM %5 != 0)  {
            B[i] = NM;
            i++;
        } else {
            System.out.println("Valor inválido! ");
        }

    }
    System.out.println("Exibindo valores da Matriz C: ");

    for (int i = 0; i < 12; i++) {
        C[i] = A[i];
        C[i + 12] = B[i];
    }


    for(int i=0; i<24; i++){
        System.out.print(C[i] + ", ");
    }
    input.close();
}

}
