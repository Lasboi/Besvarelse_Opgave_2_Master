package Opgave_2_2;

/*
Vi starter med at importere scanner klassen så vi kan benytte den i vores kode.
Vi sætter derefter en masse doubles op der skal holde styr på vores værdier.
Vi opretter en ny scanner der skal tage imod input.
Vi tager imod input fra brugeren og skriver informationer ud til konsollen.
Vi udregner areal og volume og printer dette ud til brugeren.
 */
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        double length;
        double radius;
        double area;
        double volume;

        Scanner input = new Scanner(System.in);

        System.out.print("Skriv din ønskede radius af cylinderen: ");
        radius = input.nextDouble();
        System.out.print("Skriv din ønskede længde af cylinderen: ");
        length = input.nextDouble();
        area = (radius * radius) * 3.14;
        volume = area * length;
        System.out.println("Arealet af cylinderen er: " + area);
        System.out.println("Volumen af cylinderen er: " + volume);
    }
}
