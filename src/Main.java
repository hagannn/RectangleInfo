import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static double getDouble(String prompt) {
        double num = 0;
        boolean correctInput = false;

        InputStreamReader sr = new InputStreamReader(System.in);
        BufferedReader br =  new BufferedReader(sr);

        do {
            try {
                System.out.print(prompt);
                String raw_input = br.readLine();
                num = Double.parseDouble(raw_input);
                correctInput = true;
            } catch (Exception e) {
                System.out.println("Invalid input, try again");
            }

        } while (!correctInput);

        return num;
    }

    static void generateOutput(double width, double length) {
        double area = width * length;
        double lengthDiagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(length, 2));

        System.out.printf("Area: %.2f\nLength of Diagonal: %.2f", area, lengthDiagonal);
    }

    public static void main(String[] args) {
        double width = getDouble("Enter width of rect: ");
        double length = getDouble("Enter length of rect: ");
        generateOutput(width, length);
    }
}
