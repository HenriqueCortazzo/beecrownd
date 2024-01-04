package beecrowndExercises;
import java.util.Arrays;
import java.util.Scanner;

public class bee1042 {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();

                int [] sort = new int[3];

                sort[0] = a;
                sort[1] = b;
                sort[2] = c;

                Arrays.sort(sort);

                for (int i = 0; i< sort.length; i++) {

                    System.out.println(sort[i]);
                }

                System.out.println("");
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);

                sc.close();
            }

        }