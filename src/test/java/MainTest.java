import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void main_test() {
    }

    @Test
    public void add_test() {
    float ergebnis = Main.add(18,25);
        assertEquals(43,ergebnis,0.01);
    }

    @Test
    public void sub_test() {
        float ergebnis = Main.sub(18,24);
        assertEquals(-6,ergebnis,0.01);
    }

    @Test
    public void mul_test() {
        float ergebnis = Main.mul(8,9);
        assertEquals(72,ergebnis,0.01);

        ergebnis = Main.mul(-8,9);
        assertEquals(-72,ergebnis,0.01);
    }

    @Test (expected = ArithmeticException.class)
    public void div_test() {
        float ergebnis = Main.div(5,0);

    }

    @Test
    public void berechnePunktVorStrich_test() {
        String ergebnis_mul = Main.berechnePunktVorStrich("5 + 2 * 3");
        assertEquals("5 + 6.0",ergebnis_mul);

        String ergebnis_div = Main.berechnePunktVorStrich("5 + 2 / 4");
        assertEquals("5 + 0.5",ergebnis_div);

        String ergebnis_mul_and_div = Main.berechnePunktVorStrich("5 + 2 * 3 / 4");
        assertEquals("5 + 1.5",ergebnis_mul_and_div);
    }
    @Test
    public void berechneErgebnis_test(){
        String[] zeichen = {"2","+","7.9","-","10"};
        float ergebnis = Main.berechneErgebnis(zeichen);
        assertEquals(-0.1, ergebnis, 0.01);
    }
}