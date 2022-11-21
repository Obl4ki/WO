package pl.edu.zut.po.wzorce.czujniki.adapterobiektowy;

import pl.edu.zut.po.wzorce.czujniki.adapterobiektowy.CzujnikPogodowy;

public class WeatherSensorAdapter implements CzujnikPogodowy {
    WeatherSensor czujnik;

    public WeatherSensorAdapter(WeatherSensor czujnik) {
        this.czujnik = czujnik;
    }

    public double pobierzCisnienie() {
        double hPa = czujnik.readPressure() * 1000;
        return round_to_two_places(hPa);
    }

    public double pobierzTemperature() {
        double celcius = fahrenheit_to_celcius(czujnik.readTemp());
        return round_to_two_places(celcius);
    }

    public double pobierzWilgotnosc() {
        double normalized_humidity = czujnik.readHumidity();
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
