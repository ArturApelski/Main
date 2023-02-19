import java.util.Scanner;

public class Tablica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wyświetla tablice");
        int[] tablicaLiczb = { 1,4,6,8,20,25,49,69};
        for (int i = 0; i < tablicaLiczb.length; i++) {
            System.out.println("Elementy" + i+ "to"+ tablicaLiczb[i]);
        }
        double sumTab = tablicaLiczb[0] + tablicaLiczb[1] + tablicaLiczb[2] + tablicaLiczb[3] + tablicaLiczb[4] + tablicaLiczb[5] + tablicaLiczb[6] + tablicaLiczb[7];
        System.out.println("Suma elementów tablicy");
    }
}
