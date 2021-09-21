package wk4;

//22. Randomness -> WeatherForecaster
import java.util.Random;

public class WeatherForecaster {
    private Random random;

    public WeatherForecaster() {
        this.random = new Random();
    }

    public String forecastWeather() {
        double probability = this.random.nextDouble();

        if (probability <= 0.1) {
            return "Sleet"; //Sleet with a probability of 10%
        } else if (probability <= 0.4) { //0.1 + 0.3
            return "Snow"; //Snow with a probability of 30%
        } else { //The rest, 1.0 - 0.4 = 0.6
            return "Sunny"; //Sunny with a probability of 60%
        }
    }

    public int forecastTemperature() {
        return (int) (4*this.random.nextGaussian() - 3);
        //(int) changes the bracketed floating point number into an integer value
        //A corresponding method transforms integer values into floating point numbers.
        //This is called an explicit type conversion.
    }
}