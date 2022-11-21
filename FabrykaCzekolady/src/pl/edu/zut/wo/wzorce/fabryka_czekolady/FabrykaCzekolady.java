package pl.edu.zut.wo.wzorce.fabryka_czekolady;

import pl.edu.zut.wo.wzorce.fabryka_czekolady.singleton.klasyczny.*;
import pl.edu.zut.wo.wzorce.fabryka_czekolady.singleton.synchro.*;
import pl.edu.zut.wo.wzorce.fabryka_czekolady.singleton.eager.*;
import pl.edu.zut.wo.wzorce.fabryka_czekolady.singleton.double_lock.*;
import pl.edu.zut.wo.wzorce.fabryka_czekolady.singleton.jbloch.*;

public class FabrykaCzekolady {

	public static void main(String... params) {
		CzekoladowyKociołKlasyczny kocioł = CzekoladowyKociołKlasyczny.pobierzInstancję();
		CzekoladowyKociołKlasyczny kocioł2 = CzekoladowyKociołKlasyczny.pobierzInstancję();
		kocioł.napełniaj();
		kocioł2.napełniaj();
		kocioł.gotuj();
		kocioł2.gotuj();
		kocioł.opróżniaj();
		kocioł2.opróżniaj();
		
		CzekoladowyKociołSynchro kociołS = CzekoladowyKociołSynchro.pobierzInstancję();
		CzekoladowyKociołSynchro kociołS2 = CzekoladowyKociołSynchro.pobierzInstancję();
		kociołS.napełniaj();
		kociołS2.napełniaj();
		kociołS.gotuj();
		kociołS2.gotuj();
		kociołS.opróżniaj();
		kociołS2.opróżniaj();
		
		CzekoladowyKociołEager kociołE = CzekoladowyKociołEager.pobierzInstancję();
		CzekoladowyKociołEager kociołE2 = CzekoladowyKociołEager.pobierzInstancję();
		kociołE.napełniaj();
		kociołE2.napełniaj();
		kociołE.gotuj();
		kociołE2.gotuj();
		kociołE.opróżniaj();
		kociołE2.opróżniaj();
		
		CzekoladowyKociołDoubleLock kociołD = CzekoladowyKociołDoubleLock.pobierzInstancję();
		CzekoladowyKociołDoubleLock kociołD2 = CzekoladowyKociołDoubleLock.pobierzInstancję();
		kociołD.napełniaj();
		kociołD2.napełniaj();
		kociołD.gotuj();
		kociołD2.gotuj();
		kociołD.opróżniaj();
		kociołD2.opróżniaj();
		
		CzekoladowyKociołJbloch kociołJ = CzekoladowyKociołJbloch.INSTANCE;
		CzekoladowyKociołJbloch kociołJ2 = CzekoladowyKociołJbloch.INSTANCE;
		kociołJ.napełniaj();
		kociołJ2.napełniaj();
		kociołJ.gotuj();
		kociołJ2.gotuj();
		kociołJ.opróżniaj();
		kociołJ2.opróżniaj();
	}
}
