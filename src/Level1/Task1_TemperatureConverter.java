package Level1;
import java.util.*;

public class Task1_TemperatureConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature value:");
        int temp = sc.nextInt();

        System.out.println("Which type of temperature is it — Celsius or Fahrenheit? (Type 'C' or 'F'):");
        String inputUnit = sc.next();

        if (inputUnit.equalsIgnoreCase("C")) {
            System.out.println("Do you want to convert to Fahrenheit or keep it Celsius? (Type 'F' or 'C'):");
            String conversion = sc.next();
            if (conversion.equalsIgnoreCase("F")) {
                double fahrenheit = temp * (9.0 / 5.0) + 32;
                System.out.printf("%d°C = %.2f°F\n", temp, fahrenheit);
            } else {
                System.out.println(temp + "°C (no conversion performed)");
            }

        } else if (inputUnit.equalsIgnoreCase("F")) {
            System.out.println("Do you want to convert to Celsius or keep it Fahrenheit? (Type 'C' or 'F'):");
            String conversion = sc.next();
            if (conversion.equalsIgnoreCase("C")) {
                double celsius = (temp - 32) * 5.0 / 9.0;
                System.out.printf("%d°F = %.2f°C\n", temp, celsius);
            } else {
                System.out.println(temp + "°F (no conversion performed)");
            }

        } else {
            System.err.println("Invalid temperature type. Please type 'C' or 'F'.");
        }

        sc.close();
    }
}
