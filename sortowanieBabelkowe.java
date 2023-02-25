import java.util.Scanner;

public class sortowanieBabelkowe {

    private static void b_sort(int tab[]){
        int temp;
        int zmiana = 1;
        while(zmiana > 0){
            zmiana = 0;
            for(int i=0; i<tab.length-1; i++){
                if(tab[i]>tab[i+1]){
                    temp = tab[i+1];
                    tab[i+1] = tab[i];
                    tab[i] = temp;
                    zmiana++;
                }
            }
        }
        for(int i=0; i<tab.length; i++){
            System.out.print(tab[i]+" ");
        }
    }

    public static void main(String[] args) {
        int ilosc;
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj ilość elementów tablicy");
        ilosc = in.nextInt();

        int[] tab = new int[ilosc];
        for(int i=0; i<tab.length; i++){
            System.out.println("Podaj element tablicy:");
            tab[i] = in.nextInt();
        }
        b_sort(tab);
    }
}