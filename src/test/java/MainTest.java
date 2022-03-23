import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void main_test() {
    }

    @Test
    public void add_test() {
    float ergebnis = Main.add(18,24);
        assertEquals(42,ergebnis,0.01);
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
        String ergebnis = Main.berechnePunktVorStrich("5 + 2 * 3");
        assertEquals("5 + 6",ergebnis);
    }
}