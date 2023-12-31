package beecrowndExercises;

import java.util.Scanner;

public class bee1040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3, n4, media, notaExame, resultadoExame, mediaFinal;

        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        n3 = sc.nextDouble();
        n4 = sc.nextDouble();

        int peso1, peso2, peso3, peso4, pesoTotal;

        peso1 = 2;
        peso2 = 3;
        peso3 = 4;
        peso4 = 1;
        pesoTotal = peso1 + peso2 + peso3 + peso4;

        media = ((n1 * peso1) + (n2 * peso2) + (n3 * peso3) + (n4 * peso4)) / pesoTotal;

        System.out.printf("Media: %.1f\n", media);

        if (media >= 7) {
            System.out.println("Aluno aprovado.");
        } else if (media >= 5 && media <= 6.9) {
            System.out.println("Aluno em exame.");
            notaExame = sc.nextDouble();
            resultadoExame = (notaExame + media) / 2;
            if (resultadoExame >= 5) {
                System.out.printf("Media: %.1f\n", media);
                System.out.println("Aluno em exame.");
                System.out.printf("Nota do exame: %.1f\n", notaExame);
                if (notaExame >= 5) {
                    System.out.println("Aluno aprovado.");
                } else {
                    System.out.println("Aluno reprovado.");
                }
                mediaFinal = ((n1 * peso1) + (n2 * peso2) + (n3 * peso3) + (n4 * peso4) + notaExame) / pesoTotal;
                System.out.printf("Media final: %.1f\n", mediaFinal);
            } else if (resultadoExame < 5) {
                System.out.printf("Media: %.1f\n", media);
                System.out.println("Aluno em exame.");
                if (notaExame >= 5) {
                    System.out.println("Aluno aprovado.");
                } else {
                    System.out.println("Aluno reprovado.");
                }
                mediaFinal = ((n1 * peso1) + (n2 * peso2) + (n3 * peso3) + (n4 * peso4) + notaExame) / pesoTotal;
                System.out.printf("Media final: %.1f\n", mediaFinal);
            }
        } else {
            System.out.println("Aluno reprovado.");
        }
    }
}
