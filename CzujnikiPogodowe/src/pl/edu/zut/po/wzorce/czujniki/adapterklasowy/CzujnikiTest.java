package pl.edu.zut.po.wzorce.czujniki.adapterklasowy;

public class CzujnikiTest {
    
    public static void main(String[] args) {
        CzujnikPogodowy adapter = new WeatherSensorAdapter();

        Wyswietlacz wyswietlacz = new Wyswietlacz(adapter);
        wyswietlacz.wyswietlDanePogodowe();

        for (int i = 0; i < 5; i++) {
            wyswietlacz.wyswietlDanePogodowe();
        }             
        
    }
}
