package pl.edu.zut.wo.wzorce.pogodynka;

import pl.edu.zut.wo.wzorce.pogodynka.wyświetl.PrognozaWyświetlanie;
import pl.edu.zut.wo.wzorce.pogodynka.wyświetl.StatystykaWyświetlanie;
import pl.edu.zut.wo.wzorce.pogodynka.wyświetl.WarunkiBieżąceWyświetlanie;

public class StacjaMeteo {

	public static void main(String[] args) {
		DanePogodowe danePogodowe = new DanePogodowe();
		PrognozaWyświetlanie prognozaWyświetl = new PrognozaWyświetlanie();
		WarunkiBieżąceWyświetlanie warunkiBieżąceWyświetl = new WarunkiBieżąceWyświetlanie();
		StatystykaWyświetlanie statystykaWyświetl = new StatystykaWyświetlanie();
		danePogodowe.zarejestrujObserwatora(prognozaWyświetl);
		danePogodowe.zarejestrujObserwatora(warunkiBieżąceWyświetl);
		danePogodowe.zarejestrujObserwatora(statystykaWyświetl);
		danePogodowe.ustawOdczyty(26.6f, 65, 1013.1f);
		danePogodowe.ustawOdczyty(27.7f, 70, 997.0f);
		danePogodowe.ustawOdczyty(25.5f, 90, 997.0f);
	}
	
}