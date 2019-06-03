public class ConverterHelperClass extends ConverterFactory {

    private static final String[] specialNames = {
            "",
            " thousand",
            " million",
            " billion",
            " trillion",
            " quadrillion",
            " quintillion"
    };

    @Override
    public String convertNumber(int number) {

        number=Integer.parseInt(String.valueOf(number).trim());

        if (number == 0) { return "zero"; }

        String prefix = "";

        String current = "";
        int place = 0;

        do {
            int n = number % 1000;
            if (n != 0){
                String s = new ConverterHelperClassForThousands().convertNumber(n);
                current = s + specialNames[place] + current;
            }
            place++;
            number /= 1000;
        } while (number > 0);

        return (prefix + current).trim();
    }
}
