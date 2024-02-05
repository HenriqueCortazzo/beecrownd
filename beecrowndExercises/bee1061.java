package beecrowndExercises;

import java.util.Scanner;

public class bee1061 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dia,data;
        int diaInicio,diafinal,horasInicio,horasFinal, minutosInicio,minutosFinal, segundosInicio,segundosFinal;
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
        horasInicio = Integer.parseInt(data.substring(0,2));
        minutosInicio = Integer.parseInt(data.substring(2,4));
        segundosInicio = Integer.parseInt(data.substring(4,6));
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
        horasFinal = Integer.parseInt(data.substring(0,2));
        minutosFinal = Integer.parseInt(data.substring(2,4));
        segundosFinal = Integer.parseInt(data.substring(4,6));
        System.out.println(horasFinal +" : "+minutosFinal+" : "+segundosFinal);
        if (diafinal>=diaInicio){
            int diaResultado = diafinal-diaInicio;
            System.out.printf("%d dia(s)\n",diaResultado);
        }
        if (horasInicio<horasFinal){
            int horasTotais = horasInicio-horasFinal;
            if (horasTotais<0){
                 int resultadoFinal = horasTotais*(-1);
                System.out.printf("%d hora(s)\n",resultadoFinal);
            }
        }else if(horasFinal<horasInicio){
            int horasTotais = (horasFinal+24)-horasInicio;
            System.out.printf("%d hora(s)",horasTotais);
        }else {
            System.out.printf("%d hora(s)\n",24);
        }


        if (minutosInicio<minutosFinal){
            int minTotais = horasInicio-horasFinal;
            if (minTotais<0){
                 int resultadoFinal = minTotais*(-1);
                System.out.printf("%d minuto(s)\n",resultadoFinal);
            }
        }else if(minutosInicio>minutosFinal){
            int minTotais = (minutosFinal+60)-minutosInicio;
            System.out.printf("%d minuto(s)",minTotais);
        }else {
            System.out.printf("%d hora(s)\n",1);
            System.out.printf("%d minutos(s)\n",0);
        }


      if (segundosInicio<segundosFinal){
            int segTotais = segundosInicio-segundosFinal;
            if (segTotais<0){
                 int resultadoFinal = segTotais*(-1);
                System.out.printf("%d segundo(s)\n",resultadoFinal);
            }
        }else if(segundosInicio>segundosFinal){
            int segTotais = (segundosFinal+60)-segundosInicio;
            System.out.printf("%d segundo(s)",segTotais);
        }else {
            System.out.printf("%d minuto(s)\n",1);
          System.out.printf("%d segundos(s)\n",0);
        }

    }
}
