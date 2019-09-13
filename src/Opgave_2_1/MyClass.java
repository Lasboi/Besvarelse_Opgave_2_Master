package Opgave_2_1;

/*
Vi starter med at importere klassen Scanner til vores program.
Derefter definere vi en double til celsius og en double til fahrenheit som vi skal bruge som input og udregning
Vi opretter en ny scanner kaldet input og skriver en linje tekst ud samt vi beder brugeren om et input som bliver regnet
om til en double og herefter bliver den værdi brugeren skrev sat som celsius.
Til slut i koden laver vi udregningen fra celsius til fahrenheit og skriver så fahrenheit værdien ud til konsollen.
 */
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        double celsius;
        double fahrenheit;
        Scanner input = new Scanner(System.in);

        System.out.print("Skriv dine grader i Celsius: ");
        celsius = input.nextDouble();
        System.out.print(celsius + " grader i Celsius er = ");
        fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.print(fahrenheit + " grader i Fahrenheit!");
    }
}
