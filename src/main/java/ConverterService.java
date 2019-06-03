public class ConverterService {

    private String finalNumberToString;

    @Override
    public String toString() {
        return this.finalNumberToString;
    }

    public ConverterService(String inputNumber) {
        this.finalNumberToString = convertNumToWord(inputNumber);
    }

    private String convertNumToWord(String inputNumber) {

        String retString;

        try {

            if (inputNumber.length() == 0) {
                throw new InvalidInputException("Input Number is empty, Please enter any number in range '0 - 999,999,999' !");
            }

            int convertedToNum = Integer.parseInt(inputNumber);

            if (inputNumber.length() > 9) {
                throw new InvalidInputException("Unsupported number format !! Samples numbers range '0 - 999,999,999' !");
            }
            if (convertedToNum < 0) {
                throw new UnsupportedNumberException("Unsupported Number, should be a positive integer range '0 - 999,999,999' !");
            }else {
                retString=execute(convertedToNum);
            }
        } catch (InvalidInputException ie) {
            retString=ie.toString();
        } catch (NumberFormatException numberIsNotInteger) {
            numberIsNotInteger = new NumberFormatException("Unsupported Number format provided !");
            retString = numberIsNotInteger.toString();
        } catch (UnsupportedNumberException negativeNumber) {
            retString=negativeNumber.toString();
        }
        return  retString.trim();
    }

    private String execute(Integer inputNumber) {

        return new ConverterHelperClass().convertNumber(inputNumber);
    }
}
