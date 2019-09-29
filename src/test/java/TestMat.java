import l2.MatT;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMat {
    @Test
    public void testDog() {
        String result = MatT.Mat("i love dog","dog");
        assertEquals("i love ***", result);
    }

    @Test
    public void testCat() {
        String result = MatT.Mat("i love cat","cat");
        assertEquals("i love ***", result);
    }

    @Test
    public void testQw() {
        String result = MatT.Mat("i love qwerty","qwerty");
        assertEquals("i love ***", result);
    }
    @Test
    public void testZero(){
        String result = MatT.Mat("i love tea","chair");
        assertEquals("i love tea", result);
    }
    @Test
    public void tesNo(){
        String result = MatT.Mat("","");
        assertEquals("", result);
    }
}
