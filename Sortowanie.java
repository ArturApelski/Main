import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Sortowanie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tab[] = {2,6,34,12,9,56,69,99};
        int max = tab[0];
        int min = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
            if (tab[i] < min) {
                min = tab[i];
            }
        }


        System.out.println("Liczba najwieksza w tablicy: " + max);
        System.out.println("Liczba najmniejsza w tablicy: " + min);


    }
}
