package beecrowndExercises;

import java.util.Scanner;

public class bee1045 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, maior = 0;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        double[] vetor = {a, b, c};
        for (double v : vetor) {
            if (v > maior) maior = v;
        }
        a = maior;

        if (a>=b+c){
            System.out.println("NAO FORMA TRIANGULO");
        }
        if (Math.pow(a,2)== Math.pow(b,2)+Math.pow(c,2)){
            System.out.println("TRIANGULO RETANGULO");
        } if (Math.pow(a,2)>(Math.pow(b,2)+Math.pow(c,2))){
            System.out.println("TRIANGULO OBTUSANGULO");
        } if (Math.pow(a,2)<Math.pow(b,2)+Math.pow(c,2)){
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if (a==b && b ==c){
            System.out.println("TRIANGULO EQUILATERO");
        }
        if (a==b || b==c || a==c){
            System.out.println("TRIANGULO ISOSCELES");
        }
    }
}
