
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

}
