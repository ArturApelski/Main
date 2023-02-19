import java.util.Random;
import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {
        System.out.print("Podaj swoje liczby lotto: ");
        Scanner scanner = new Scanner(System.in);
        int twojLos = scanner.nextInt();
        int[] pamiec = new int[6];
        Random liczba = new Random();
        losowanie: for (int i = 0; i <= 5; i++) {
            int los = liczba.nextInt(49)+1;
            for (int j = 0; j < i; j++) {
                if (los == pamiec[j]){
                    --i;
                    continue losowanie;
                }
            }
            pamiec[i] = los;
            System.out.print(pamiec[i] + " ");

            if(twojLos != los) {
                System.out.println("Niestety nie dopisało ci szczęście!");
            }
            if (twojLos ==  los) {
                    System.out.println("Brawo wygrałeś 1 000 000 $!!!!!!!");

            }

        }
    }
}
