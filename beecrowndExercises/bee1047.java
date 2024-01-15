package beecrowndExercises;

import java.util.Scanner;

public class bee1047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horaInicial, minutoInicial, horaFinal, minutoFinal, horasEMinutosTotais, resultadoFinal;
        horaInicial = scanner.nextInt();
        minutoInicial = scanner.nextInt();
        horaFinal = scanner.nextInt();
        minutoFinal = scanner.nextInt();
        if (horaFinal > horaInicial) {
            horasEMinutosTotais = horaInicial - horaFinal;
            if (horasEMinutosTotais < 0) {
                resultadoFinal = horasEMinutosTotais * (-1);
                System.out.println(resultadoFinal);
            }
        } else if (horaInicial > horaFinal) {
            horasEMinutosTotais = (horaFinal + 24) - horaInicial;
            System.out.println(horasEMinutosTotais);
        } else {
            System.out.println(24);

        }
    }
}
