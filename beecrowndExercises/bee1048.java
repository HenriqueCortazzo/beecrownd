package beecrowndExercises;

import java.util.Scanner;

public class bee1048 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salarioFuncionario = scanner.nextDouble();
        double reajuste = 0;
        double novoSalarioFuncionario = 0;
        int percentual = 0;
        String format;
        if (salarioFuncionario > 0 && salarioFuncionario <= 400) {
            novoSalarioFuncionario += 15 * (salarioFuncionario / 100);
            reajuste = novoSalarioFuncionario - salarioFuncionario;
            percentual = 15;
            format = String.format("Novo salario: %.2f\n\" +Reajuste ganho: %.2f\n" + "Em percentual: %f%%", novoSalarioFuncionario, reajuste, percentual);
            System.out.println(format);
        } else if (salarioFuncionario > 400 && salarioFuncionario <= 800) {
            novoSalarioFuncionario += 12 * (salarioFuncionario / 100);
            reajuste = novoSalarioFuncionario - salarioFuncionario;
            percentual = 12;
            format = String.format("Novo salario: %.2f\n" + "Reajuste ganho: %.2f\n" + "Em percentual: %f%%", novoSalarioFuncionario, reajuste, percentual);
        } else if (salarioFuncionario > 800 && salarioFuncionario <= 1200) {
            novoSalarioFuncionario += 10 * (salarioFuncionario / 100);
            reajuste = novoSalarioFuncionario - salarioFuncionario;
            percentual = 10;
            format = String.format("Novo salario: %.2f\n" + "Reajuste ganho: %.2f\n" + "Em percentual: %f%%", novoSalarioFuncionario, reajuste, percentual);
        } else if (salarioFuncionario > 1200 && salarioFuncionario <= 2000) {
            novoSalarioFuncionario += 7 * (salarioFuncionario / 100);
            reajuste = novoSalarioFuncionario - salarioFuncionario;
            percentual = 7;
            format = String.format("Novo salario: %.2f\n" + "Reajuste ganho: %.2f\n" + "Em percentual: %f%%", novoSalarioFuncionario, reajuste, percentual);
        } else if (salarioFuncionario > 2000) {
            novoSalarioFuncionario += 4 * (salarioFuncionario / 100);
            reajuste = novoSalarioFuncionario - salarioFuncionario;
            percentual = 4;
            format = String.format("Novo salario: %.2f\n" + "Reajuste ganho: %.2f\n" + "Em percentual: %f%%", novoSalarioFuncionario, reajuste, percentual);
        }
    }
}
