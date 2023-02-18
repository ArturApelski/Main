import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoja wage w kilogramach: ");
        double waga = scanner.nextDouble();
        System.out.println("Podaj swoj wzrost w metrach: ");
        double wzrost = scanner.nextDouble();
        double wynik = waga/ Math.pow(wzrost,2);
        System.out.println("Twoje wskaznik BMI wynosi: " + wynik);
        if (wynik <= 18.5)
        {
            System.out.println("Jesteś chudy!!!!!!");
        }else if (wynik >= 25)
        {
            System.out.println("Jesteś gruby!!!!!!");
        }else if (wynik > 18.5 && wynik < 25)
        {
            System.out.println("Masz odpowiednia wage");
        }


    }
}
