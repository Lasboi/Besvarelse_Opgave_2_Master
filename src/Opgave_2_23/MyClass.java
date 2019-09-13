package Opgave_2_23;

//Vi starter med at importere klassen Scanner
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {

        //Vi instansere de doubles vi vil bruge gennem koden
        double distance;
        double km;
        double price;
        double cost;

        //Vi instansere en ny scanner kaldet input
        Scanner input = new Scanner(System.in);

        //Vi printer en besked ud og venter på input fra brugeren
        System.out.print("Skriv hvor langt du har kørt i meter: ");
        distance = input.nextDouble();

        //Vi printer en besked ud og venter på input fra brugeren
        System.out.print("Skriv hvor mange km du køre per liter: ");
        km = input.nextDouble();

        //Vi printer en besked ud og venter på input fra brugeren
        System.out.print("Skriv hvad prisen er i kroner per liter benzin: ");
        price = input.nextDouble();

        //Vi omregner meter til km så det er nemmere at udregne
        distance = distance / 1000;

        //Vi laver quick math og finder frem til den pris det vil koste at køre turen ud fra brugerens input og skriver
        //Dette ud til brugeren
        cost = (distance / km) * price;
        System.out.println("Prisen for at køre denne tur er " + cost + " kr.");

    }
}
