package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        double temperatureFahrenheite = (temperatureCelsius * (9/5.0)) + 32;
        System.out.println(temperatureFahrenheite);
    }
}
