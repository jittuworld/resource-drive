
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class ConverterServiceTest {

    private static final String invalidInputTypeException = "InvalidInputException: Input Number is empty, Please enter any number in range '0 - 999,999,999' !";

    private static final String unsupportedNumberException = "UnsupportedNumberException: Unsupported Number, should be a positive integer range '0 - 999,999,999' !";

    private static final String numberFormatException = "java.lang.NumberFormatException: Unsupported Number format provided !";

  @Test
    public void checkNumberToWord(){
        String strExpected = "ninety nine";
        String number = "99";
        ConverterService strOutput = new ConverterService(number);
        assertEquals(strExpected,strOutput.toString());
    }

    @Test
    public void checkNegativeNumberResultToException(){
        String negNumber = "-99";
        ConverterService cs = new ConverterService(negNumber);
        assertEquals(unsupportedNumberException,cs.toString());
    }

    @Test
    public void checkHigherNumberResultToException(){
        String negNumber = "10000000000";
        ConverterService cs = new ConverterService(negNumber);
        assertEquals(numberFormatException,cs.toString());
    }

    @Test
    public void checkEmptyInputResultToException(){
        String negNumber = "";
        ConverterService cs = new ConverterService(negNumber);
        assertEquals(invalidInputTypeException,cs.toString());
    }
}