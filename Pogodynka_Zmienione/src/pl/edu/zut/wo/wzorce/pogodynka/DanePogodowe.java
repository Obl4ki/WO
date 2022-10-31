package pl.edu.zut.wo.wzorce.pogodynka;

import java.util.ArrayList;

public class DanePogodowe implements Podmiot {
	private float temperatura;
	private float wilgotność;
	private float ciśnienie;
	private float HeatIndex;
	
	private ArrayList<Obserwator> obserwatorzy = new ArrayList<>();
	
	@Override
	public void zarejestrujObserwatora(Obserwator o) {
		obserwatorzy.add(o);
	};
	public void usuńObserwatora(Obserwator o) {
		obserwatorzy.remove(o);
	};
	public void powiadomObserwatorów() {
		float temp = pobierzTemperaturę();
		float wilgotność = pobierzWilgotność();
		float ciśnienie = pobierzCiśnienie();
		float HI = pobierzHeatIndex();
		obserwatorzy.forEach((n) -> n.aktualizacja(temp, wilgotność, ciśnienie, HI));
	};
	
	/*public void odczytyZmiana(){
		float temp = pobierzTemperaturę();
		float wilgotność = pobierzWilgotność();
		float ciśnienie = pobierzCiśnienie();
		float HI = pobierzHeatIndex();
		warunkiBieżąceWyświetl.aktualizacja(temp, wilgotność, ciśnienie, HI);
		statystykaWyświetl.aktualizacja(temp, wilgotność, ciśnienie, HI);
		prognozaWyświetl.aktualizacja(temp, wilgotność, ciśnienie, HI);
	}*/

	private float pobierzTemperaturę(){
		return temperatura;
	}

	private float pobierzWilgotność(){
		return wilgotność;
	}

	private float pobierzCiśnienie(){
		return ciśnienie;
	}
	
	private float pobierzHeatIndex(){
		return HeatIndex;
	}
	
	private float computeHeatIndex(float t, float rh) {
		float index = (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh)
		+ (0.00941695 * (t * t)) + (0.00728898 * (rh * rh))
		+ (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
		(0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
		(rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
		(0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
		0.000000000843296 * (t * t * rh * rh * rh)) -
		(0.0000000000481975 * (t * t * t * rh * rh * rh)));
		return index;
		}
	
	public void ustawOdczyty(float temperatura, float wilgotność, float ciśnienie) {
		this.temperatura = temperatura;
		this.wilgotność = wilgotność;
		this.ciśnienie = ciśnienie;
		this.HeatIndex = computeHeatIndex(temperatura, wilgotność);
		powiadomObserwatorów();
	}
	

	
}
