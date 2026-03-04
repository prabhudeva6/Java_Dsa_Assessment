package MODULE5;

import java.io.FileReader;
import java.io.IOException;

public class Exception{

    public static void main(String[] args) {

        //1 Checked Exception
        try {
            FileReader file = new FileReader("sample.txt");
            System.out.println("File opened successfully.");
        }
        catch (IOException e) {
            System.out.println("Checked Exception caught: " + e);
        }

        // 2 Unchecked Exception

        try {
            int a = 10;
            int b = 0;
            int result = a / b;  // ArithmeticException
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Unchecked Exception caught: " + e);
        }

        System.out.println("Program continues after exception handling.");
    }
}