package beecrowndExercises;

import java.util.Scanner;

public class bee1046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horaInicial, horaFinal,horasDeJogo;
        horaInicial = scanner.nextInt();
        horaFinal = scanner.nextInt();
        horasDeJogo=0;

        if (horaInicial<horaFinal){
            horasDeJogo = horaInicial-horaFinal;
        }else if(horaFinal<horaInicial){
            horasDeJogo = (horaFinal+24)-horaInicial;
        }
        System.out.println(horasDeJogo);
    }
}
