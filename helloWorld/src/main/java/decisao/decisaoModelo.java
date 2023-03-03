package decisao;

import java.util.Scanner;

public class decisaoModelo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double n1, n2, n3, n4;
        double md;

        System.out.println("informe a primeira nota");
        n1 = input.nextDouble();

        System.out.println("informe a segunda nota");
        n2 = input.nextDouble();

        System.out.println("informe a terceira nota");
        n3 = input.nextDouble();

        System.out.println("informe a quarta nota");
        n4 = input.nextDouble();

        md= (n1+ n2 + n3 + n4 ) / 4;


         if (md >=5) {
             System.out.println("Aprovado");
         }
          else {
              System.out.println("Reprovado");
         }



           System.out.println("media" + md);



           input.close();
    }
}
