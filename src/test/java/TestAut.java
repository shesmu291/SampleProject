import l2.Passw;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestAut {

    @Test
    public void testIncorrect(){
        boolean result = Passw.singu( "12345",  "123333" );
        assertEquals(false, result);
    }
    @Test
    public void testCorrect(){
        boolean result = Passw.singu( "pupil",  "pupil" );
        assertEquals( true, result);
    }
}
