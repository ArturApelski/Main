import java.util.Scanner;

public class Tablica2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wyświetla tablice");
        int  sumTab = 0;
        int rozTab = 0;
        int iloczTab = 1;
        double ilorazTab = 1;
        int[] tablicaLiczb = { 1,4,6,8,20,25,49,69};
        for (int i = 0; i < tablicaLiczb.length; i++) {
            sumTab = sumTab + tablicaLiczb[i];
            rozTab = rozTab - tablicaLiczb[i];
            iloczTab = iloczTab * tablicaLiczb[i];
            ilorazTab = ilorazTab / tablicaLiczb[i];
        }
        System.out.println("Suma elementów tablicy " + sumTab + ".");
        System.out.println("Różnica elementów tablicy " + rozTab + ".");
        System.out.println("Iloczyn elementów tablicy " + iloczTab + ".");
        System.out.println("Iloraz elemtów tablicy " + ilorazTab + ".");

    }
}
