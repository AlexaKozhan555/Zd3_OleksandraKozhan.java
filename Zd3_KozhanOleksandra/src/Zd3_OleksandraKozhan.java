import java.util.Scanner;

public class Zd3_OleksandraKozhan {
    public static void main(String args[]) {
        System.out.println("*W tej metodzie odczytujemy liczbę wprowadzoną przez użytkownika i sprawdzamy, jest ona parzysta, czy nieparzysta");
        System.out.println();

        int num_OleksandraKozhan;
        System.out.println("Wpisz liczbę: ");

        //Odczytujemy liczbę wprowadzoną przez użytkownika w konsoli
        Scanner input = new Scanner(System.in);
        //Numer wprowadzony przez użytkownika w konsoli jest przechowywany w zmiennej num_OleksandraKozhan
        num_OleksandraKozhan = input.nextInt();
        // Jeśli liczba jest podzielna przez 2, jest to liczba parzysta, w przeciwnym razie nieparzysta
        // jeśli reszta z podziału wynosi zero, to liczba jest parzysta
        System.out.println("*Numer wprowadzony przez użytkownika w konsoli jest przechowywany w zmiennej");
        System.out.println("*Jeśli liczba w tej zmiennej jest podzielna przez 2, jest to liczba parzysta, w przeciwnym razie nieparzysta");
        System.out.println("*jeśli reszta z podziału wynosi zero, to liczba jest parzysta");
        System.out.println();

        if ( num_OleksandraKozhan % 2 == 0 )
            System.out.println("Liczba " + num_OleksandraKozhan + " jest parzysta");
        else
            System.out.println("Liczba " + num_OleksandraKozhan + " jest nieparzysta");
    }
}
