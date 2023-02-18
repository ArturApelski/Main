import java.util.Scanner;

public class choinka {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        System.out.println("Daj liczbe");
        int a = b.nextInt();
        for (int i = a; i >= 0; i--) {
            for (int j = i; j >= 0; j--)
                System.out.print(" ");
            for (int k = 2*(a - i); k >= 0 ; k--)
                System.out.print("*");
            System.out.println();


        }

    }

}
