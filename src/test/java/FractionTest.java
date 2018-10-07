
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {

    private Fraction fraction;

    @BeforeEach
    void before() {

        fraction = new Fraction(2, 2);
    }

    @Test
    void testFractionInt() {
        assertEquals(2, fraction.getNumerator());
        assertEquals(2, fraction.getDenominator());
    }

    @Test
    void testDecimal() {
        assertEquals(1, this.fraction.decimal(), 10e-5);
    }

    @Test
    void testIsPropia(){
        assertEquals(false,fraction.isPropia());
        fraction = new Fraction(2,3);
        assertEquals(true,fraction.isPropia());
    }

    @Test
    void testMultiply() {
        Fraction fraction1 = new Fraction(4,7);
        assertEquals(8, this.fraction.multiply(fraction1).getNumerator());
        assertEquals(14, this.fraction.getDenominator());
    }

    @Test
    void testDivide() {
        Fraction fraction1 = new Fraction(2,6);
        assertEquals(4, this.fraction.multiply(fraction1).getNumerator());
        assertEquals(12, this.fraction.getDenominator());
    }

}
