package beecrowndExercises;

import java.util.Scanner;

public class bee1061 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dia, horas, minutos, segundos;
        int diaInicio;
        dia = scanner.nextLine();
        dia = dia.replace(" ", "");
        if (dia.length() > 4) {
           diaInicio = Integer.parseInt(String.valueOf(dia.substring(dia.length() - 2)));
        } else {
           diaInicio = Integer.parseInt(String.valueOf(dia.charAt(dia.length() - 1)));
        }
        System.out.println(diaInicio);
    }
}
