package pl.edu.zut.wo.wzorce.pilot;

import pl.edu.zut.wo.wzorce.pilot.polecenia.PolecenieWlaczSwiatlo;
import pl.edu.zut.wo.wzorce.pilot.sterowniki.Swiatlo;

public class MiniPilotTest {
	public static void main(String[] args) {
		MiniPilot pilot = new MiniPilot();
		Swiatlo swiatlo = new Swiatlo("lokalizacja: ");
		pilot.ustawPolecenie(new PolecenieWlaczSwiatlo(swiatlo));
		pilot.przyciskZostalNacisniety();
	}
}
