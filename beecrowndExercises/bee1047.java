package beecrowndExercises;

import java.util.Scanner;

public class bee1047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horaInicial, minutoInicial, horaFinal, minutoFinal, horasTotais, minutosTotais, resultadoFinalHoras, resultadoFinalMinutos;
        String formatcaoMsg;
        horaInicial = scanner.nextInt();
        minutoInicial = scanner.nextInt();
        horaFinal = scanner.nextInt();
        minutoFinal = scanner.nextInt();
        if (horaFinal > horaInicial && minutoFinal > minutoInicial) {
            horasTotais = horaInicial - horaFinal;
            minutosTotais = minutoInicial - minutoFinal;
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
            formatcaoMsg = String.format("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", horasTotais, minutosTotais);
            System.out.println(formatcaoMsg);
        } else if (horaFinal > horaInicial && minutoFinal < minutoInicial) {
            horasTotais = horaInicial - horaFinal;
            minutosTotais = (minutoFinal + 60) - minutoInicial;
            if (minutosTotais == 59) {
                if (horasTotais < 0) {
                    resultadoFinalHoras = horasTotais * (-1) - 1;
                    formatcaoMsg = String.format("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", resultadoFinalHoras, minutosTotais);
                    System.out.println(formatcaoMsg);
                }
            } else if (horaFinal < horaInicial && minutoFinal > minutoInicial) {
                horasTotais = (horaFinal + 24) - horaInicial;
                minutosTotais = minutoInicial - minutoFinal;
                if (minutosTotais == 59) {
                    if (horasTotais < 0) {
                        resultadoFinalHoras = horasTotais * (-1) - 1;
                        formatcaoMsg = String.format("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", resultadoFinalHoras, minutosTotais);
                        System.out.println(formatcaoMsg);
                    }
                }
            } else {
                formatcaoMsg = String.format("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", 24, 0);
                System.out.println(formatcaoMsg);

            }
        }
    }
}