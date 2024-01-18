package beecrowndExercises;

import java.util.Scanner;

public class bee1048 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salarioFuncionario = scanner.nextDouble();
        double reajuste;
        double novoSalarioFuncionario;
        int percentual;
        String format;
        if (salarioFuncionario > 0 && salarioFuncionario <= 400) {
            novoSalarioFuncionario = salarioFuncionario + 15 * (salarioFuncionario / 100);
            reajuste = novoSalarioFuncionario - salarioFuncionario;
            percentual = 15;
            format = String.format("Novo salario: %.2f\n" + "Reajuste ganho: %.2f\n" + "Em percentual: %d%%", novoSalarioFuncionario, reajuste, percentual);
            System.out.println(format);
        } else if (salarioFuncionario > 400 && salarioFuncionario <= 800) {
            novoSalarioFuncionario = salarioFuncionario + 12 * (salarioFuncionario / 100);
            reajuste = novoSalarioFuncionario - salarioFuncionario;
            percentual = 12;
            format = String.format("Novo salario: %.2f\n" + "Reajuste ganho: %.2f\n" + "Em percentual: %d%%", novoSalarioFuncionario, reajuste, percentual);
            System.out.println(format);
        } else if (salarioFuncionario > 800 && salarioFuncionario <= 1200) {
            novoSalarioFuncionario = salarioFuncionario + 10 * (salarioFuncionario / 100);
            reajuste = novoSalarioFuncionario - salarioFuncionario;
            percentual = 10;
            format = String.format("Novo salario: %.2f\n" + "Reajuste ganho: %.2f\n" + "Em percentual: %d%%", novoSalarioFuncionario, reajuste, percentual);
            System.out.println(format);
        } else if (salarioFuncionario > 1200 && salarioFuncionario <= 2000) {
            novoSalarioFuncionario = salarioFuncionario + 7 * (salarioFuncionario / 100);
            reajuste = novoSalarioFuncionario - salarioFuncionario;
            percentual = 7;
            format = String.format("Novo salario: %.2f\n" + "Reajuste ganho: %.2f\n" + "Em percentual: %d%%", novoSalarioFuncionario, reajuste, percentual);
            System.out.println(format);
        } else if (salarioFuncionario > 2000) {
            novoSalarioFuncionario = salarioFuncionario + 4 * (salarioFuncionario / 100);
            reajuste = novoSalarioFuncionario - salarioFuncionario;
            percentual = 4;
            format = String.format("Novo salario: %.2f\n" + "Reajuste ganho: %.2f\n" + "Em percentual: %d%%", novoSalarioFuncionario, reajuste, percentual);
            System.out.println(format);
        }
    }
}
