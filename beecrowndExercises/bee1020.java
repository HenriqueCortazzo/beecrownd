package beecrowndExercises;

import java.util.Scanner;

public class bee1020 {
    public static void main(String[] args) {
        int ano, mes, dia, valorEntrada;
        Scanner sc = new Scanner(System.in);
        valorEntrada = sc.nextInt();
        dia = valorEntrada;
        ano = dia / 365;
        mes = (dia - (ano * 365)) / 30;
        dia = valorEntrada  - (mes * 30)- (ano * 365);
        System.out.printf("%d anos(s)\n%d mes(es)\n%d dia(s)\n",ano,mes,dia);
    }
}
