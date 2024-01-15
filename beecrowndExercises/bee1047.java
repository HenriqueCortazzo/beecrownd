package beecrowndExercises;

import java.util.Scanner;

public class bee1047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horaInicial, minutoInicial, horaFinal, minutoFinal, horasTotais, minutosTotais, resultadoFinalHoras, resultadoFinalMinutos, horasEMinutosResultantes;
        resultadoFinalHoras = 0;
        resultadoFinalMinutos = 0;
        String formatcaoMsg = String.format("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", resultadoFinalHoras, resultadoFinalMinutos);
        horaInicial = scanner.nextInt();
        minutoInicial = scanner.nextInt();
        horaFinal = scanner.nextInt();
        minutoFinal = scanner.nextInt();
        if (horaFinal > horaInicial && minutoFinal > minutoInicial) {
            horasTotais = horaInicial - horaFinal;
            minutosTotais = minutoInicial - minutoFinal;
            resultadoFinalHoras = horasTotais * (-1);
            resultadoFinalMinutos = minutosTotais * (-1);
            if (horasTotais < 0) {
                resultadoFinalHoras = horasTotais * (-1);
                resultadoFinalMinutos = minutosTotais * (-1);
                formatcaoMsg = String.format("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", resultadoFinalHoras, resultadoFinalMinutos);
                System.out.println(formatcaoMsg);
            } else if (minutosTotais < 0) {
                resultadoFinalHoras = horasTotais * (-1);
                resultadoFinalMinutos = minutosTotais * (-1);
                formatcaoMsg = String.format("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", resultadoFinalHoras, resultadoFinalMinutos);
                System.out.println(formatcaoMsg);
            }
        } else if (horaInicial > horaFinal && minutoInicial > minutoFinal) {
            minutosTotais = (minutoFinal + 60) - minutoInicial;
            horasTotais = (horaFinal + 24) - horaInicial;
            System.out.println(horasTotais);
        } else {
            System.out.println(24);

        }
    }
}
