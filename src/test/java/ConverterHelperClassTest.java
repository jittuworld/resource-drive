import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterHelperClassTest {

    private static final String output = "two billion";

    private static String result ;
    @Before
    public void setup() {
        int num = 2000000000;
        ConverterHelperClass cs = new ConverterHelperClass();
        result=cs.convertNumber(num);
    }


    @Test
    public void checkConvertNumberMethod() {
        assertEquals(output,result);
    }

}