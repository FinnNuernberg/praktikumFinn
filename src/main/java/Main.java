import java.util.Objects;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Using Scanner for Getting Input from User
        Scanner in = new Scanner(System.in);
        //Read next input

        //print user input

        System.out.println("Guten Tag - Wilkommen im Taschenrechner. Folgende Rechenarten stehen zur Verfügung [add], [sub], [mul], [div]");
        System.out.println("Geben Sie eine Aufgabe an: ");
        String aufgabe = in.nextLine(); //Aufgabe des Nutzers in der Konsole
        if (args.length != 0) {
            aufgabe = args[0];
            for (int i =)
        }
        String[] zeichen = aufgabe.split(" ");
        berechneErgebnis(zeichen);
    }

    private static void berechneErgebnis(String[] zeichen) {
        float zwischenErgebnis = 0;
        float zahl1 = Float.parseFloat(zeichen[0]);
        zwischenErgebnis = zahl1;
        String operant = "";
        String zahltext = "";
        for (int i = 1; i < zeichen.length; i = i + 2) {

            operant = zeichen[i]; //zweites zeichen im ersten Schleifendurchlauf
            zahltext = zeichen[i + 1]; //erstes zeichen im ersten Schleifendurchlauf



            float zahl = Float.parseFloat(zahltext);

            if (Objects.equals(operant, "+")) {
                zwischenErgebnis = add(zwischenErgebnis, zahl);
                System.out.println(zwischenErgebnis);
            }
            if (Objects.equals(operant, "-")) {
                zwischenErgebnis = sub(zwischenErgebnis, zahl);
                System.out.println(zwischenErgebnis);
            }
            if (Objects.equals(operant, "*")) {
                zwischenErgebnis = mul(zwischenErgebnis, zahl);
                System.out.println(zwischenErgebnis);
            }
            if (Objects.equals(operant, "/")) {
                zwischenErgebnis = div(zwischenErgebnis, zahl);
                System.out.println(zwischenErgebnis);
            }
        }
    }


    public static float add(float zahl1, float zahl2) {

        return zahl1 + zahl2;
    }


    public static float sub(float zahl1, float zahl2) {

        return zahl1 - zahl2;
    }

    public static float mul(float zahl1, float zahl2) {

        return zahl1 * zahl2;
    }

    public static float div(float zahl1, float zahl2) {
        if (zahl2 == 0) {
            System.out.println("Sie dürfen nicht durch 0 teilen");
            throw new ArithmeticException("Nutzer hat durch 0 geteilt");
        }

        return zahl1 / zahl2;
    }


}