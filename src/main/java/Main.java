public class Main {

    public static void main(String[] args) {
        float zahl1 = 13 ; float zahl2 = 11;
        System.out.println(zahl1 +  " - " +zahl2 +" = " +sub(zahl1,zahl2));
        System.out.println(zahl1 +  " + " +zahl2 +" = " +add(zahl1,zahl2));
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