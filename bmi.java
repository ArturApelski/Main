import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoja wage w kilogramach: ");
        double waga = scanner.nextDouble(); //Podajemy swoją wage do obliczenia BMI
        System.out.println("Podaj swoj wzrost w metrach: ");
        double wzrost = scanner.nextDouble();//Podajemy swój wzrost aby obliczyć BMI
        double wynik = waga/ Math.pow(wzrost,2);
        System.out.println("Twoje wskaznik BMI wynosi: " + wynik);
        if (wynik <= 18.5)//Jeśli twoje BMI jest mniejsze równe niż 18.5 masz niskie BMI
        {
            System.out.println("Jesteś chudy!!!!!!");
        }else if (wynik >= 25)//Jeśli twoje BMI wyniesie większe równe 25 masz za wyskie BMI
        {
            System.out.println("Jesteś gruby!!!!!!");
        }else if (wynik > 18.5 && wynik < 25)//Jeśli twój wynik jest pomiędzy 18.5 a 25 masz prawidłowe BMI
        {
            System.out.println("Masz odpowiednia wage");
        }


    }
}
