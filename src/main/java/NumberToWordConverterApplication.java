import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberToWordConverterApplication {


    public static void main(String[] args)  {

        System.out.println("Enter the number: ");

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        {
            System.out.println(new ConverterService(br.readLine().trim()).toString());


        } catch (IOException e){
            System.out.println("Unable to read input values - " + e.toString());
        }

    }
}
