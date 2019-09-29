
import l2.Sr;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSr {
    @Test
    public void testPositive(){
        double result = Sr.sred(5, 3);
        assertEquals(4, result);
    }
    @Test
    public void testNegative(){
        double result = Sr.sred(-5, -3);
        assertEquals(-4, result);
    }
    @Test
    public void testZero(){
        double result = Sr.sred(0, 0);
        assertEquals(0, result);
    }
    @Test
    public void testDrob() {
        double result = Sr.sred(1.5, 1.5);
        assertEquals(1.5, result);
    }
}
