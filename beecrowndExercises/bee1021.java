package beecrowndExercises;

import java.util.Scanner;

public class bee1021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = {100, 50, 20, 10, 5, 2};
        double[] moedas = {1, 0.50, 0.25, 0.10, 0.05, 0.01};
        double valorObtido = sc.nextDouble();
        valorObtido = (valorObtido * 100) + 0.05;
        double restante = 0;
        for (int i = 0; i < notas.length; i++) {
            int quantNotas = (int) ((int) valorObtido / (notas[i] * 100));
            if (quantNotas != 0) {
                System.out.println(quantNotas + " nota(s) de R$ " + notas[i] + ",00");
                valorObtido %= notas[i] * 100;
            }
        }
        for (double moeda : moedas) {
            int quantMoedas = (int) (valorObtido / (moeda * 100));
            if (quantMoedas != 0) {
                System.out.println(quantMoedas + " moeda(s) de R$ " + moeda);
                valorObtido %= moeda * 100;
            }
        }
    }
}