package beecrowndExercises;

import java.util.Scanner;

public class bee1019 {
    public static void main(String[] args) {
        int horas, minutos, segundos, resto;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        segundos = n;
        horas = segundos / 3600;
        minutos = (n - (horas * 3600))/60;
        segundos = n -(horas * 3600)-(minutos * 60);
        System.out.printf("%d:%d:%d", horas, minutos, segundos);
    }
}
