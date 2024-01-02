package beecrowndExercises;

import java.util.Scanner;

public class bee1040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1, n2, n3, n4, media, notaExame, mediaFinal;

        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        n3 = sc.nextFloat();
        n4 = sc.nextFloat();

        media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;

        if (media >= 7) {
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno aprovado.");

        } else if (media >= 5 && media <= 6.9) {
            notaExame = sc.nextFloat();
            mediaFinal = (notaExame+media)/2;
            if (mediaFinal >= 5) {
                System.out.printf("Media: %.1f\n", media);
                System.out.println("Aluno em exame.");
                System.out.printf("Nota do exame: %.1f\n", notaExame);
                if (notaExame >= 5) {
                    System.out.println("Aluno aprovado.");
                } else {
                    System.out.println("Aluno reprovado.");
                }
                System.out.printf("Media final: %.1f\n", mediaFinal);
            } else if (mediaFinal < 5) {
                System.out.printf("Media: %.1f\n", media);
                System.out.println("Aluno em exame.");
                if (notaExame >= 5) {
                    System.out.println("Aluno aprovado.");
                } else {
                    System.out.println("Aluno reprovado.");
                }
                System.out.printf("Media final: %.1f\n", mediaFinal);
            }
        } else {
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno reprovado.");
        }
    }
}
