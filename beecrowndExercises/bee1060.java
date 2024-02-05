package beecrowndExercises;

import java.util.ArrayList;
    import java.util.Scanner;

public class bee1060 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double [] numbers =new double[6];
        double valor;
        int numPositivos=0;
        for (int i = 0; i < 6; i++) {
            valor = scanner.nextDouble();
            numbers[i] = valor;
        }
        for(double num : numbers){
            if (num>0){
                numPositivos++;
            }
        }
        System.out.printf("%d valores positivos\n",numPositivos);
    }
}
