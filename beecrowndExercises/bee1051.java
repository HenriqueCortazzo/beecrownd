package beecrowndExercises;

import java.util.Scanner;

public class bee1051 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario, valorDoImposto = 0;
        double limite = 0, restante, restanteImposto, porcentagem18, porcentagem8;
        salario = scanner.nextDouble();
        if (salario > 4500) { //salario = 5000
            limite = 4500;
            restante = salario - limite;
            restanteImposto = restante * ((double) 28 / 100);
            porcentagem18 = 1500 * ((double) 18 / 100);
            porcentagem8 = 1000 * ((double) 8 / 100);
            valorDoImposto = restanteImposto + porcentagem18 + porcentagem8;
            System.out.printf("R$ %.2f\n", valorDoImposto);
        } else if (salario > 3000) {
            limite = 3000;
            restante = salario - limite;
            restanteImposto = restante * ((double) 18 / 100);
            porcentagem8 = 1000 * ((double) 8 / 100);
            valorDoImposto = restanteImposto + porcentagem8;
            System.out.printf("R$ %.2f\n", valorDoImposto);
        }else if (salario>2000){
            limite = 2000;
            restante = salario - limite;
            restanteImposto = restante * ((double) 8 / 100);
            valorDoImposto = restanteImposto;
            System.out.printf("R$ %.2f\n", valorDoImposto);
        }else System.out.println("Isento");
    }
}

