package beecrowndExercises;

import java.util.Scanner;

public class bee1019 {
    public static void main(String[] args) {
        int horas, minutos, segundos, resto;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        segundos = n;
        horas = segundos / 3600;
        minutos = segundos / 60;
        segundos = n -(minutos * 60);
        System.out.printf("%d : %d : %d", horas, minutos, segundos);
    }
}
