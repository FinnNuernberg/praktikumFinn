import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Using Scanner for Getting Input from User
        Scanner in = new Scanner(System.in);
        //Read next input

        //print user input

        System.out.println("Guten Tag - Wilkommen im Taschenrechner. Folgende Rechenarten stehen zur Verfügung [add], [sub], [mul], [div]");
        System.out.println("Geben Sie Zahl1 an: ");
        String zahl1text = in.nextLine();
        System.out.println("Geben Sie Zahl2 an: ");
        String zahl2text = in.nextLine();
        float zahl1 = Float.parseFloat(zahl1text);
        float zahl2 = Float.parseFloat(zahl2text);

        System.out.println(zahl1 +  " + " +zahl2 +" = " +add(zahl1,zahl2));
        System.out.println(zahl1 +  " - " +zahl2 +" = " +sub(zahl1,zahl2));
        System.out.println(zahl1 +  " * " +zahl2 +" = " +mul(zahl1,zahl2));
        System.out.println(zahl1 +  " / " +zahl2 +" = " +div(zahl1,zahl2));
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