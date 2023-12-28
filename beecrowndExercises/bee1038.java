package beecrowndExercises;

import java.util.Scanner;

public class bee1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo, quantidade;
        double[] valores = {4, 4.50, 5, 2, 1.50};
        codigo = sc.nextInt();
        quantidade = sc.nextInt();

        switch (codigo) {
            case 1:
                System.out.printf("Total: R$ %.2f\n", quantidade * valores[0]);
                break;
            case 2:
                System.out.printf("Total: R$ %.2f\n", quantidade * valores[1]);
                break;
            case 3:
                System.out.printf("Total: R$ %.2f\n", quantidade * valores[2]);
                break;
            case 4:
                System.out.printf("Total: R$ %.2f\n", quantidade * valores[3]);
                break;
            case 5:
                System.out.printf("Total: R$ %.2f\n", quantidade * valores[4]);
                break;
        }
    }
}
