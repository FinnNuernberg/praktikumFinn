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
        String zahl1text = zeichen[0];
        String rechenarttext = zeichen[1];
        String zahl2text = zeichen[2];

        float zahl1 = Float.parseFloat(zahl1text);
        float zahl2 = Float.parseFloat(zahl2text);


        System.out.println("Ihr Ergebnis ist:");


        if (Objects.equals(rechenarttext, "+")){
            System.out.println(zahl1 +  " + " +zahl2 +" = " +add(zahl1,zahl2));
        }
        if (Objects.equals(rechenarttext, "-")){
            System.out.println(zahl1 +  " - " +zahl2 +" = " +sub(zahl1,zahl2));
        }
        if (Objects.equals(rechenarttext, "*")){
            System.out.println(zahl1 +  " * " +zahl2 +" = " +mul(zahl1,zahl2));
        }
        if (Objects.equals(rechenarttext, "/")){
            System.out.println(zahl1 +  " / " +zahl2 +" = " +div(zahl1,zahl2));
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