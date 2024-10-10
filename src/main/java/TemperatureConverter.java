
public class TemperatureConverter {

    /**
     * Converts Fahrenheit to Celsius.
     *
     * @param fahrenheit The temperature in Fahrenheit.
     * @return The temperature in Celsius.
     */
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    /**
     * Converts Celsius to Fahrenheit.
     *
     * @param celsius The temperature in Celsius.
     * @return The temperature in Fahrenheit.
     */
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    /**
     * Checks if the given Celsius temperature is extreme.
     *
     * @param celsius The temperature in Celsius.
     * @return True if the temperature is below -40 or above 50, otherwise false.
     */
    public boolean isExtremeTemperature(double celsius) {
        return celsius < -40 || celsius > 50;
    }

    public static float kelvinToCel(float kel){
        return (float) (kel - 273.15);
    }


    // add main method that tests conversions and writes what happens
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        System.out.println("0 Fahrenheit is " + converter.fahrenheitToCelsius(0) + " Celsius");
        System.out.println("0 Celsius is " + converter.celsiusToFahrenheit(0) + " Fahrenheit");
        System.out.println("Is -50 Celsius extreme? " + converter.isExtremeTemperature(-50));
        System.out.println("Is 20 Celsius extreme? " + converter.isExtremeTemperature(20));
        System.out.println("Is 60 Celsius extreme? " + converter.isExtremeTemperature(60));
        System.out.println("0 Kelviniä on celciuksissa " + kelvinToCel(0));
    }
}
