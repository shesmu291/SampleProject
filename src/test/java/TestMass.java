import l2.Mass;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMass {
    @Test
    public void testPos() {
        int[] arr={1,3,5};
        int result = Mass.sredArr(arr);
        assertEquals(3, result);
    }
    @Test
    public void testZero() {
        int[] arr={0,0,0,0,0};
        int result = Mass.sredArr(arr);
        assertEquals(0, result);
    }
    @Test
    public void testNegPos() {
        int[] arr = {-1, -3, 4, 12};
        int result = Mass.sredArr(arr);
        assertEquals(3, result);
    }
    @Test
    public void testNeg() {
        int[] arr = {-1, -3, -4, -12};
        int result = Mass.sredArr(arr);
        assertEquals(5, result);
    }
    @Test
    public void testNo() {
        int[] arr = {};
        int result = Mass.sredArr(arr);
        assertEquals(0, result);
    }
}
