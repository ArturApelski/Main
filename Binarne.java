import java.util.Scanner;

public class Binarne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe do przeliczenia: ");
        int liczba = scanner.nextInt();
        System.out.println("Na jaki system chcesz przeliczyć: ");
        System.out.println("2. Binarne");
        System.out.println("8. Ósemkowe");
        System.out.println("16. Szesnastkowe");
        int wybor = scanner.nextInt();

        String wynik = " ";
        switch (wybor){
            case 2:
                while (liczba > 0){
                    wynik = (liczba % 2)+ wynik;
                    liczba = liczba / 2;
                }
                break;
            case 8:
                while (liczba > 0){
                    wynik = (liczba % 8 )+ wynik;
                    liczba = liczba / 8;
                }
                break;
            case 16:
                while (liczba > 0){
                    int reszta = liczba % 16;
                    if (reszta < 10){
                        wynik = reszta + wynik;
                    }else {
                        wynik = (char)('A' + reszta - 10) + wynik;
                    }
                    liczba = liczba / 16;
                }
                break;
            default:
                System.out.println("Brak opcji!!!!!");
                return;
        }
        System.out.println("Liczba w systemie" + wybor + "-kowym: " + wynik);


    }

}
