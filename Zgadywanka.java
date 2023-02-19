import java.util.Random;
import java.util.Scanner;

public class Zgadywanka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int LiczbaDoZgadniecia = random.nextInt(100) + 1;
        System.out.println("Wymysliłem liczbe z przedziału do 1 - 100. Zgadnij liczbe");

        int LiczbaOdUzytkownika;
        int iloscProb = 0;
        do {
            iloscProb++;
            System.out.println("Podaj liczbe: ");
            LiczbaOdUzytkownika = scanner.nextInt();

            if (LiczbaOdUzytkownika < LiczbaDoZgadniecia) {
                System.out.println("Podales za mala liczbe");
            } else if (LiczbaOdUzytkownika > LiczbaDoZgadniecia) {
                System.out.println("Podales za duza liczbe");
            } else {
                System.out.println("Gratuluje!! Zgadles liczbe w " + iloscProb + " probie");
            }
        } while (LiczbaDoZgadniecia != LiczbaOdUzytkownika);

    }

}