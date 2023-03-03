package Lista3Exercicios;

import java.util.Scanner;

public class FahrenheintDezEmDez {
    public static void main(String[] args) {

        int celsius = 10;
        for (int contador = 1; contador <9; contador++ ) {
            int F = (9 * celsius + 160) / 5;

            System.out.println(celsius + " celsius " + "recebe temperatura em fahrenhenint: " + F);

            celsius = celsius + 10;
        }

    }
}
