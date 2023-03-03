package Lista3Exercicios;

public class DecimoQuinto {
    public static void main(String[] args) {
        double ValorAtual = 1;
        double ValorAnterior;
        double soma = 0;

        for (double i = 1; i < 65; i++) {

            System.out.println(ValorAtual);

            ValorAnterior = ValorAtual;
            ValorAtual = ValorAnterior * 2;

            soma  = soma + ValorAnterior;


            System.out.println(soma);   }
    }

    }
