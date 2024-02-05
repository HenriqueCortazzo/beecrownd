package beecrowndExercises;

import java.util.ArrayList;
import java.util.Scanner;

public class bee1060 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Integer> numbers = new ArrayList<>();
        int valor;
        for (int i = 0; i < 6; i++) {
            valor = scanner.nextInt();
            numbers.add(valor);
        }
        for(int num : numbers){
            if (num>0){
                System.out.println(num);
            }
        }
    }
}
