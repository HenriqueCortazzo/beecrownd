package beecrowndExercises;

import java.util.Scanner;

public class bee1047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horaInicial, minutoInicial, horaFinal, minutoFinal, horasTotais, minutosTotais;
        String formatcaoMsg;
        horaInicial = scanner.nextInt();
        minutoInicial = scanner.nextInt();
        horaFinal = scanner.nextInt();
        minutoFinal = scanner.nextInt();

        horasTotais = horaFinal - horaInicial;
        if (horasTotais < 0) {
            horasTotais += 24;
        }

        minutosTotais = minutoFinal - minutoInicial;
        if (minutosTotais < 0) {
            minutosTotais += 60;
            horasTotais--;
        }

        if (horasTotais < 0 || (horasTotais == 0 && minutosTotais == 0)) {
            horasTotais += 24;
        }

        formatcaoMsg = String.format("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", horasTotais, minutosTotais);
        System.out.println(formatcaoMsg);

    }
}