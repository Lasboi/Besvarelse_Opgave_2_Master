package Opgave_2_12;

/*
I denne kode starter vi med at importere Scanner så vi kan benytte den.
Efterfølgende instansiere vi en masse doubles som skal bruges til at holde styr på vores data.
Vi tager imod input fra brugeren og laver en beregning ud fra brugerens input.
Vi skriver til sidst det korrekte resultat ud, ud fra vores udregning.
 */
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        double length;
        double speed;
        double acceleration;

        Scanner input = new Scanner(System.in);

        System.out.println("Denne beregner bruges til at finde frem til hvad minimum for en flyvebane skal være");
        System.out.print("Skriv hastigheden du flyver med: ");
        speed = input.nextDouble();
        System.out.print("Skriv den acceleration du har: ");
        acceleration = input.nextDouble();
        length = (speed *speed ) / (2 * acceleration);
        System.out.println("Længden skal som minimum være " + length + " Meter lang");
    }
}
