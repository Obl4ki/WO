package pl.edu.zut.wo.wzorce.pogodynka.wyświetl;

import pl.edu.zut.wo.wzorce.pogodynka.Obserwator;

public class WarunkiBieżąceWyświetlanie implements Obserwator, WyświetlElement {

	private float temperatura;
	private float wilgotność;
	private float ciśnienie;
	private float HeatIndex;

	public void aktualizacja(float temperatura, float wilgotność, float ciśnienie, float HI) {
		this.temperatura = temperatura;
		this.wilgotność = wilgotność;
		this.ciśnienie = ciśnienie;
		this.HeatIndex = HI;
		wyświetl();
	}
	
	public void wyświetl() {
		System.out.println("Warunki bieżące " + temperatura + " stopni C, " + wilgotność + 
				"% wilgotność " + ciśnienie + " ciśnienie oraz " + HeatIndex + " HeatIndex.");
	}

}