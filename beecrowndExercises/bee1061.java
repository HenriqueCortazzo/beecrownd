package beecrowndExercises;

import java.util.Scanner;

public class bee1061 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dia,data, horasInicio,horasFinal, minutosInicio,minutosFinal, segundosInicio,segundosFinal;
        int diaInicio,diafinal;
        dia = scanner.nextLine();
        dia = dia.replace(" ", "");
        if (dia.length() > 4) {
            diaInicio = Integer.parseInt(String.valueOf(dia.substring(dia.length() - 2)));
        } else {
            diaInicio = Integer.parseInt(String.valueOf(dia.charAt(dia.length() - 1)));
        }
        System.out.println(diaInicio);
        data = scanner.nextLine();
        data = data.replace(" : ", "");
        horasInicio = data.substring(0,2);
        minutosInicio = data.substring(2,4);
        segundosInicio =data.substring(4,6);
        System.out.println(horasInicio +" : "+minutosInicio+" : "+segundosInicio);

        dia = scanner.nextLine();
        dia = dia.replace(" ", "");
        if (dia.length() > 4) {
           diafinal = Integer.parseInt(String.valueOf(dia.substring(dia.length() - 2)));
        } else {
            diafinal = Integer.parseInt(String.valueOf(dia.charAt(dia.length() - 1)));
        }
        System.out.println(diafinal);
        data = scanner.nextLine();
        data = data.replace(" : ", "");
        horasFinal = data.substring(0,2);
        minutosFinal = data.substring(2,4);
        segundosFinal =data.substring(4,6);
        System.out.println(horasFinal +" : "+minutosFinal+" : "+segundosFinal);
    }
}
