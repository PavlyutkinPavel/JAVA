public class BaseConverter {
    public double t_Celsius;
    private double t_Kelvin;

    private double t_Fahrenheit;

    public double get_t_Celsius() {
        return t_Celsius;
    }

    public void set_t_Celsius(double temperature) {
        this.t_Celsius = temperature;
    }


    /*public BaseConverter(double temperature) {
        t_Celsius = temperature;
    }*/

    private double ConvertToKelvin(double temperature) {
        t_Kelvin = temperature + 273.15;
        return t_Kelvin;
    }

    private double ConvertToFahrenheit(double temperature) {
        t_Fahrenheit = 1.8 * temperature + 32;
        return t_Fahrenheit;
    }

    public void displayInfo() {
        System.out.println("\n\nTemperature Celsius = " + t_Celsius + "\nTemperature Kelvin = " + ConvertToKelvin(t_Celsius) +
                "\nTemperature Fahrenheit = " + ConvertToFahrenheit(t_Celsius));
    }
}
