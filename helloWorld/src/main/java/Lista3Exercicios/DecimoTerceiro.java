package Lista3Exercicios;

import java.util.Scanner;

public class DecimoTerceiro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

          int[] mtz = new int[12];
         for (int i = 0; i < mtz.length; i++) {
             
            System.out.println("informe o valor do numero" + (i + 1) + " : ");
            mtz[i] = input.nextInt();

            for (int j : mtz) {
                System.out.println( j + " , ");
            }

        }

            












        input.close();
    }
}
