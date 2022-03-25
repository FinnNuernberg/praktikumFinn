import java.util.Objects;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Using Scanner for Getting Input from User
        Scanner in = new Scanner(System.in);
        //Read next input

        //print user input

        String aufgabe = "";
        if (args.length > 0) {
            for (int i = 0; i < args.length; i = i + 1) {
                aufgabe = args[i];
                berechneUndZeigeErgebnis(aufgabe);
            }
        } else {
            System.out.println("Guten Tag - Wilkommen im Taschenrechner. Folgende Rechenarten stehen zur Verfügung [add], [sub], [mul], [div]");
            do {
                System.out.println("Geben Sie eine Aufgabe an: ");
                aufgabe = in.nextLine(); //Aufgabe des Nutzers in der Konsole
                if(!aufgabe.equals("")) {
                    berechneUndZeigeErgebnis(aufgabe);
                }
            } while (!aufgabe.equals(""));

        }

    }

    /**
     * berechnet * und /,wandelt aufgabe um: "5 + 2 * 3" --> "5 + 6"
     *
     * @param aufgabe die aufgabe die umgewandelt werden soll
     * @return die umgewandelte aufgabe
     */

    public static String berechnePunktVorStrich(String aufgabe) {
        String[] zeichen = splitAufgabe(aufgabe);
        String zwischenErgebnis = aufgabe;
        String operant = "";
        String zahl1 = "";
        String zahl2 = "";
        for (int i = 1; i < zeichen.length; i = i + 2) {

            operant = zeichen[i];

            if (Objects.equals(operant, "/") || Objects.equals(operant, "*")) {
                zahl1 = zeichen[i - 1];
                zahl2 = zeichen[i + 1];
                String subaufgabe = zahl1 + " " + operant + " " + zahl2;
                zwischenErgebnis = zwischenErgebnis.replace(subaufgabe,"" + berechneErgebnis(subaufgabe.split(" ")));
                zeichen = splitAufgabe(zwischenErgebnis);
                i = 1;
            }

        }
        return zwischenErgebnis;
    }

    private static String[] splitAufgabe(String aufgabe){
        aufgabe = aufgabe.replace(" ", "");
        return aufgabe.split("(?<=[()\\/*+-])(?=[0-9()])|(?<=[0-9()])(?=[()\\/*+-])");
    }

    private static void berechneUndZeigeErgebnis(String aufgabe) {
        aufgabe = berechnePunktVorStrich(aufgabe);
        String[] zeichen = splitAufgabe(aufgabe);
        //aufgabe = "5 + 2 * 3"
        //aufgabe = "5 + 6"
        try {
            float endErgebnis = berechneErgebnis(zeichen);
            System.out.println("Ihr Ergebnis ist:" + endErgebnis);
        }
        catch (Exception e){
            System.out.println("ungültige Eingabe");
        }

    }

    public static float berechneErgebnis(String[] zeichen) {
        float zwischenErgebnis = 0;

        zwischenErgebnis = Float.parseFloat(zeichen[0]);

        String operant = "";
        String zahltext = "";
        for (int i = 1; i < zeichen.length; i = i + 2) {

            operant = zeichen[i]; //zweites zeichen im ersten Schleifendurchlauf
            zahltext = zeichen[i + 1]; //erstes zeichen im ersten Schleifendurchlauf


            float zahl = Float.parseFloat(zahltext);
            if (Objects.equals(operant, "+")) {
                zwischenErgebnis = add(zwischenErgebnis, zahl);
            }
            if (Objects.equals(operant, "-")) {
                zwischenErgebnis = sub(zwischenErgebnis, zahl);
            }
            if (Objects.equals(operant, "*")) {
                zwischenErgebnis = mul(zwischenErgebnis, zahl);
            }
            if (Objects.equals(operant, "/")) {
                zwischenErgebnis = div(zwischenErgebnis, zahl);
            }

        }
        // zwischenErgenbnis ist nach der for-Schleife das endErgebnis
        return zwischenErgebnis;
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