import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter temperature value: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter unit of measurement (C for Celsius, F for Fahrenheit, K for Kelvin): ");
        char originalUnit = scanner.next().charAt(0);

        // Perform conversion
        double convertedCelsius = 0.0;
        double convertedFahrenheit = 0.0;
        double convertedKelvin = 0.0;

        switch (originalUnit) {
            case 'C':
            case 'c':
                convertedCelsius = temperature;
                convertedFahrenheit = celsiusToFahrenheit(temperature);
                convertedKelvin = celsiusToKelvin(temperature);
                break;
            case 'F':
            case 'f':
                convertedCelsius = fahrenheitToCelsius(temperature);
                convertedFahrenheit = temperature;
                convertedKelvin = fahrenheitToKelvin(temperature);
                break;
            case 'K':
            case 'k':
                convertedCelsius = kelvinToCelsius(temperature);
                convertedFahrenheit = kelvinToFahrenheit(temperature);
                convertedKelvin = temperature;
                break;
            default:
                System.out.println("Invalid unit of measurement. Please enter C, F, or K.");
                return;
        }

        // Display converted values
        System.out.println("Converted Values:");
        System.out.println("Celsius: " + convertedCelsius + "°C");
        System.out.println("Fahrenheit: " + convertedFahrenheit + "°F");
        System.out.println("Kelvin: " + convertedKelvin + "K");

        scanner.close();
    }

    // Conversion methods
    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    private static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    private static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * 5 / 9;
    }

    private static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    private static double kelvinToFahrenheit(double kelvin) {
        return (kelvin * 9 / 5) - 459.67;
    }
}
