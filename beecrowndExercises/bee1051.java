package beecrowndExercises;

import java.util.Scanner;

public class bee1051 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario, valorSobImposto, valorDoImposto = 0;
        salario = scanner.nextDouble();
        if (salario > 0 && salario <= 2000) {
            System.out.println("Isento");
        } else if (salario > 2000&& salario<=3000) {
            double restante = 0;
            double limite = 2000;
            double restanteImposto=0;
            valorSobImposto = salario - limite; // --> isento / sobImposto é onde sera cobrado a porcentagem
            if (valorSobImposto+2000<=limite) {
                valorDoImposto = valorSobImposto * ((double) 8 / 100);
            } else  if (valorSobImposto+2000>limite){
                restante = salario - limite;
                valorDoImposto = (valorSobImposto-restante) * ((double) 8 / 100);
                if (restante>0){
                    restanteImposto = restante * ((double) 18 / 100);
                }
                valorDoImposto +=restanteImposto;
            }
            System.out.printf("%.2f\n", valorDoImposto);
            }
         else if (salario > 3000 && salario <= 4500) {
            double restante = 0;
            double limite = 3000;
            double restanteImposto=0;
            valorSobImposto = salario - 2000; // --> isento / sobImposto é onde sera cobrado a porcentagem
            if (valorSobImposto+2000<=limite) {
                valorDoImposto = valorSobImposto * ((double) 8 / 100);
            } else  if (valorSobImposto+2000>limite){
                restante = salario - limite;
                valorDoImposto = (valorSobImposto-restante) * ((double) 8 / 100);
                if (restante>0){
                    restanteImposto = restante * ((double) 18 / 100);
                }
                valorDoImposto +=restanteImposto;
            }
            System.out.printf("%.2f\n", valorDoImposto);
        } else {
            double restante = 0;
            double limite = 4500;
            double restanteImposto=0;
            valorSobImposto = salario - limite; // --> isento / sobImposto é onde sera cobrado a porcentagem
            if (valorSobImposto+2000<=limite) {
                valorDoImposto = valorSobImposto * ((double) 8 / 100);
            } else  if (valorSobImposto+2000>limite){
                restante = salario - limite;
                valorDoImposto = (valorSobImposto-restante) * ((double) 8 / 100);
                if (restante>0&& restante<=4500){
                    restanteImposto = restante * ((double) 18 / 100);
                }else restanteImposto = restante * ((double) 28 / 100);
                valorDoImposto +=restanteImposto;
            }
            System.out.printf("%.2f\n", valorDoImposto);
        }
    }
}
