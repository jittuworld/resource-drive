class ConverterHelperClassForThousands {

    private static final String[] unitDigitNames = {
            "",
            " one",
            " two",
            " three",
            " four",
            " five",
            " six",
            " seven",
            " eight",
            " nine",
            " ten",
            " eleven",
            " twelve",
            " thirteen",
            " fourteen",
            " fifteen",
            " sixteen",
            " seventeen",
            " eighteen",
            " nineteen"
    };

    private static final String[] tensDigitNames = {
            "",
            " ten",
            " twenty",
            " thirty",
            " forty",
            " fifty",
            " sixty",
            " seventy",
            " eighty",
            " ninety"
    };

    public String convertNumber(int number) {
        String current;

        number=Integer.parseInt(String.valueOf(number).trim());

        if (number % 100 < 20){
            current = unitDigitNames[number % 100];
            number /= 100;
        }
        else {
            current = unitDigitNames[number % 10];
            number /= 10;

            current = tensDigitNames[number % 10] + current;
            number /= 10;
        }
        if (number == 0) return current;
        return unitDigitNames[number] + " hundred and" + current;
    }
}
