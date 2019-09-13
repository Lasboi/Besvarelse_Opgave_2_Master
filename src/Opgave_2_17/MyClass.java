package Opgave_2_17;

//Vi importere scanneren
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {

        //Vi instansiere en ny scanner
        Scanner input = new Scanner(System.in);

        //Vi instansiere speed, temp og windChill som en double til at holde værdier
        double speed;
        double temp;
        double windChill;

        //Vi printer en besked ud til konsollen og beder om et input
        System.out.print("Skriv temperaturen i Fahrenheit mellem -58F og 41F: ");
        temp = input.nextDouble();

        //Vores while loop checker efter det input der er skrevet og springer det over hvis den rigtige værdig er
        //indtastet men forbliver i loopet hvis der er skrevet en forkert værdi
        while (temp < -58 || temp > 41){
            System.out.print("Den intastede temperatur er ikke gyldig - Den skal være mellem -58F og 41F: ");
            temp = input.nextDouble();
        }

        //Vi printer en besked ud til konsollen og beder om et input
        System.out.print("Skriv hastigheden på vinden - Den skal være over eller lig med 2 m/s: ");
        speed = input.nextDouble();

        //Vores while loop checker efter det input der er skrevet og springer det over hvis den rigtige værdig er
        //indtastet men forbliver i loopet hvis der er skrevet en forkert værdi
        while (speed < 2 ){
            System.out.print("Den intastede hastighed er ikke gyldig - Den skal være over eller lig med 2 m/s: ");
            speed = input.nextDouble();
        }

        //Der bliver udregnet windChill ved hjælp af vores værdier og crazy math og til sidst skrives værdien ud til
        //konsollen så brugeren kan læse det ud fra deres input
        //Side note - Math.pow(a, b) er en formel som tager værdi a og ganger op i sig selv med værdi b feks
        //Math.pow(2, 6) i dette tilfælde vil resultatet blive 14 da vi tager 2 og lader 2 blive ganget med sig selv 6 gange
        windChill = 35.74 + 0.6215 * temp - 35.75 * Math.pow(speed, 0.16) + 0.4275 * temp * Math.pow(speed, 0.16);
        System.out.println("Index for vind kulden er " + windChill);
    }
}
