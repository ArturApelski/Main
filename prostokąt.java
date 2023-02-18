import java.util.Scanner;

public class prostokąt {
    public static void main(String[] args) {
        Scanner wej = new Scanner(System.in);
        System.out.println("Podaj szerokośc prostokata: ");
        int a = wej.nextInt();
        System.out.println("Podaj długość prostokąta: ");
        int b = wej.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.print("*");
            for (int j = 0; j < b; j++)
                System.out.print("*");
            System.out.println();

        }
    }
}
