import java.sql.SQLOutput;
import java.util.Scanner;

public class zada {
    //1.pętla
    /*public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Wpisz liczbe");
        int a = scanner.nextInt();
        for (int number = 0; number < 100; number++) {
            System.out.println(number);
        }
    }*/
    //2.pętla liczby pierwszej
        /*int i,m = 0, flag = 0;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        n = scanner.nextInt();
        m = n / 2;
        System.out.println("m: " + m);
        if (n==0 || n==1) {
            System.out.println(n + "is not prime number");
        }else{
            for (i = 2; i <= m; i++){
                if (n % i == 0) {
                    System.out.println(n + "is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0){
                System.out.println(n + " is prime number");
            }
        }
        }*/

    //3.petla potega
/*public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Wpisz liczbe a: ");
    int a = scanner.nextInt();
    System.out.println("Wpisz liczbe b: ");
    int b = scanner.nextInt();
    for (int i=a; i>=b; i*=5){
        System.out.println(i);
    }


}*/
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj w naszym kalkulatorze! Wybierz jedna z podanych opcji!");
        System.out.println("MENU GLOWNE");
        System.out.println("-------------");
        System.out.println("1.Dodawanie");
        System.out.println("2.Odejmowanie");
        System.out.println("3.Dzielenie");
        System.out.println("4.Mnożenie");
        System.out.println("5.Pierwiastek");
        System.out.println("6.Potegowanie");
        System.out.println("7.Pierwiastek 3 stopnia");
        System.out.println("8.Oblicznie procentu z liczby");
        System.out.println("--------------");
        char znak;
        znak = scanner.next().charAt(0);

        switch (znak) {
            case '1': {
                System.out.println("Podaj liczbe a: ");
                int liczba1 = scanner.nextInt();
                System.out.println("Podaj liczbe b: ");
                int liczba2 = scanner.nextInt();
                ?']'
                in'/suma = liczba1 + liczba2;
                System.out.println("Suma wynosi: " + suma);
                break;
                    }

            case '2': {
                System.out.println("Podaj liczbe a: ");
                int liczba1 = scanner.nextInt();
                System.out.println("Podaj liczbe b: ");
                int liczba2 = scanner.nextInt();
                int roznica = liczba1 - liczba2;
                System.out.println("Roznica wynosi: " + roznica);
                break;
                    }
            case '3':{
                System.out.println("Podaj liczbe a: ");
                int liczba1 = scanner.nextInt();
                System.out.println("Podaj liczbe b: ");
                int liczba2 = scanner.nextInt();
                int iloraz = liczba1/liczba2;
                System.out.println("Iloraz wynosi: " + iloraz);
                break;
                }
            case '4': {
                System.out.println("Podaj liczbe a: ");
                int liczba1 = scanner.nextInt();
                System.out.println("Podaj liczbe b: ");
                int liczba2 = scanner.nextInt();
                int iloczyn = liczba1*liczba2;
                System.out.println("Iloczyn wynosi: " + iloczyn);
                break;
                    }
            case '5': {
                System.out.println("Podaj liczbe a: ");
                int liczba1 = scanner.nextInt();
                double sqrt = Math.sqrt(liczba1);
                System.out.println("Pierwiastek wynosi: " + sqrt);
                break;

            }
            case '6': {
                System.out.println("Podaj podstawe: ");
                int liczba1 = scanner.nextInt();
                System.out.println("Podaj wykładnik:");
                int liczba2 = scanner.nextInt();
                double answer = Math.pow(liczba1,liczba2);
                System.out.println("Potęga wynosi: " + answer);
                break;
            }
            case '7': {
                System.out.println("Podaj liczbe: ");
                int liczba1 = scanner.nextInt();
                double sqrt = Math.pow(liczba1, 1.0/3.0);
                System.out.println("Pierwiastek 3 stopnia wynosi: " + sqrt);
                break;
            }
            /*case '8': {
                System.out.println("Podaj liczbe: ");
                int liczba1 = scanner.nextInt();
                System.out.println("Podaj liczbe procentów: ");
                int liczba2 = scanner.nextInt();
                double percent(liczba2, liczba1)
            }*/
            default:
            {
                System.out.println("Nie ma takiej opcji w menu!");
            }
            }







        }


    }



