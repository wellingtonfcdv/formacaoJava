import br.com.desafioPraticoOO.modelos.modelo.ConversorTemperatura;
import br.com.desafioPraticoOO.modelos.modelo.ConversorTemperaturaPadrao;

public class TesteConversorTemperatura {
    public static void main(String[] args) {
        ConversorTemperatura conversor = new ConversorTemperaturaPadrao();
        double temperaturaCelsius = 25;
        double temperaturaFahrenheit = conversor.celsiusParaFahrenheit(temperaturaCelsius);
        System.out.println(temperaturaCelsius + " Celsius é igual a " + temperaturaFahrenheit + " Fahrenheit.");

        temperaturaFahrenheit = 77;
        temperaturaFahrenheit = conversor.fahrenheitParaCelsius(temperaturaFahrenheit);
        System.out.println(temperaturaFahrenheit + " Farenheit é igual a " + temperaturaCelsius + " Celsius.");
    }
}
