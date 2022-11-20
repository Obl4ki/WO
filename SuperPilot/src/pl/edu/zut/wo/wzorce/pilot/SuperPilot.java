package pl.edu.zut.wo.wzorce.pilot;

import java.util.*;

import pl.edu.zut.wo.wzorce.pilot.polecenia.BrakPolecenia;
import pl.edu.zut.wo.wzorce.pilot.polecenia.Polecenie;

//
// This is the invoker
//
public class SuperPilot {
	Polecenie[] poleceniaWlącz;
	Polecenie[] poleceniaWylacz;
	Polecenie polecenieWycofaj;
 
	public SuperPilot() {
		poleceniaWlącz = new Polecenie[7];
		poleceniaWylacz = new Polecenie[7];
 
		Polecenie brakPolecenia = new BrakPolecenia();
		for(int i=0; i<7; i++) {
			poleceniaWlącz[i] = brakPolecenia;
			poleceniaWylacz[i] = brakPolecenia;
		}
		polecenieWycofaj = brakPolecenia;
	}
  
	public void ustawPolecenie(int slot, Polecenie polecenieWłącz, Polecenie polecenieWyłącz) {
		poleceniaWlącz[slot] = polecenieWłącz;
		poleceniaWylacz[slot] = polecenieWyłącz;
	}
 
	public void wcisnietoPrzyciskWlącz(int slot) {
		poleceniaWlącz[slot].wykonaj();
		polecenieWycofaj = poleceniaWlącz[slot];
	}
 
	public void wcisnietoPrzyciskWylacz(int slot) {
		poleceniaWylacz[slot].wykonaj();
		polecenieWycofaj = poleceniaWylacz[slot];
	}

	public void wcisnietoPrzyciskWycofaj() {
		polecenieWycofaj.wycofaj();
	}
 
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ Super Pilot -------\n");
		for (int i = 0; i < poleceniaWlącz.length; i++) {
			stringBuff.append("[slot " + i + "] " + poleceniaWlącz[i].getClass().getName()
				+ "    " + poleceniaWylacz[i].getClass().getName() + "\n");
		}
		stringBuff.append("[undo] " + polecenieWycofaj.getClass().getName() + "\n");
		return stringBuff.toString();
	}
}
