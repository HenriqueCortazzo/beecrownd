package beecrowndExercises;

import java.util.Scanner;

public class bee1049 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavra1, palavra2, palavra3;
        palavra1 = scanner.next();
        palavra2 = scanner.next();
        palavra3 = scanner.next();

        if (palavra1.equalsIgnoreCase("vertebrado")) {
            switch (palavra2) {
                case "ave":
                    if (palavra3.equalsIgnoreCase("carnivoro")) {
                        System.out.println("aguia");
                    } else System.out.println("pomba");
                    break;
                case "mamifero":
                    if (palavra3.equalsIgnoreCase("onivoro")) {
                        System.out.println("homem");
                    } else System.out.println("vaca");
                    break;
            }
        } else if (palavra1.equalsIgnoreCase("invertebrado")) {
            switch (palavra2) {
                case "inseto":
                    if (palavra3.equalsIgnoreCase("hematofago")) {
                        System.out.println("pulga");
                    } else System.out.println("lagarta   ");

                case "analideo":
                    if (palavra3.equalsIgnoreCase("hematofago")) {
                        System.out.println("sanguessuga");
                    } else System.out.println("minhoca");
            }
        }
        
    }
}
