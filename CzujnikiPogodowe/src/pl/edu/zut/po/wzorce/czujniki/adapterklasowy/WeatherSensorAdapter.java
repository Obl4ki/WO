package pl.edu.zut.po.wzorce.czujniki.adapterklasowy;

public class WeatherSensorAdapter extends WeatherSensor implements CzujnikPogodowy {
    public double pobierzCisnienie() {
        double hPa = this.readPressure() * 1000;
        return round_to_two_places(hPa);
    }

    public double pobierzTemperature() {
        double celcius = fahrenheit_to_celcius(this.readTemp());
        return round_to_two_places(celcius);
    }

    public double pobierzWilgotnosc() {
        double normalized_humidity = this.readHumidity();
        double humidity_percent = normalized_humidity * 100;
        ;
        return round_to_two_places(humidity_percent);
    }

    private double round_to_two_places(double value) {
        return Math.round(value * 100.0) / 100.0;
    }

    private double fahrenheit_to_celcius(double fah) {
        return (5. / 9.) * (fah - 32.);
    }
}
