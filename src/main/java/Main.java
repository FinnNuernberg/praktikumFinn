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
        String aufgabe = in.nextLine();
        String[] zeichen = aufgabe.split(" ");
        for (int i = 1; i < zeichen.length + 1 ; i = i + 1) {
            if (i % 2 == 0) {
                // operanten
                System.out.println("operant:"+zeichen[i - 1]);
            } else {
                // zahl
                System.out.println("zahl:"+zeichen[i - 1]);
            }
        }


        }



    public static float add(float zahl1,float zahl2) {

        return zahl1 + zahl2;
    }


    public static float sub(float zahl1,float zahl2) {

        return zahl1 - zahl2;
    }

    public static float mul(float zahl1,float zahl2) {

        return zahl1 * zahl2;
    }

    public static float div(float zahl1,float zahl2) {

        return zahl1 / zahl2;
    }


}