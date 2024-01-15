package beecrowndExercises;

import java.util.Scanner;

public class bee1046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horaInicial, horaFinal,horasDeJogo,resultadoFinal;
        horaInicial = scanner.nextInt();
        horaFinal = scanner.nextInt();
        if (horaInicial<horaFinal){
            horasDeJogo = horaInicial-horaFinal;
            if (horasDeJogo<0){
                resultadoFinal = horasDeJogo*(-1);
                System.out.printf("O JOGO DUROU %d HORA(S)\n",resultadoFinal);
            }
        }else if(horaFinal<horaInicial){
            horasDeJogo = (horaFinal+24)-horaInicial;
            System.out.printf("O JOGO DUROU %d HORA(S)\n",horasDeJogo);
        }else {
            System.out.printf("O JOGO DUROU %d HORA(S)\n",24);
        }

    }
}
