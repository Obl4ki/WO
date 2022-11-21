package pl.edu.zut.po.wzorce.czujniki.adapterobiektowy;

public class CzujnikiTest {

    public static void main(String[] args) {
        WeatherSensor sensor = new WeatherSensor();
        CzujnikPogodowy adapter = new WeatherSensorAdapter(sensor);

        Wyswietlacz wyswietlacz = new Wyswietlacz(adapter);
        wyswietlacz.wyswietlDanePogodowe();

        for (int i = 0; i < 5; i++) {
            wyswietlacz.wyswietlDanePogodowe();
        }
    }
}
