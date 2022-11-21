package pl.edu.zut.wo.wzorce.fabryka_czekolady;

import pl.edu.zut.wo.wzorce.fabryka_czekolady.singleton.double_lock.CzekoladowyKociołDoubleLock;
import pl.edu.zut.wo.wzorce.fabryka_czekolady.singleton.eager.CzekoladowyKociołEager;
import pl.edu.zut.wo.wzorce.fabryka_czekolady.singleton.jbloch.CzekoladowyKociołJbloch;
import pl.edu.zut.wo.wzorce.fabryka_czekolady.singleton.klasyczny.CzekoladowyKociołKlasyczny;
import pl.edu.zut.wo.wzorce.fabryka_czekolady.singleton.synchro.CzekoladowyKociołSynchro;

public class FabrykaCzekoladyWątki {

	public static void main(String... params) {
		Thread wątek1 = new Thread("Wątek 1") {
			public void run() {
				System.out.println("Uruchomione przez: " + getName());
				CzekoladowyKociołKlasyczny kocioł = CzekoladowyKociołKlasyczny.pobierzInstancję();
				kocioł.napełniaj();
				kocioł.gotuj();
				kocioł.opróżniaj();
			}
		};
		Thread wątek2 = new Thread("Wątek 2") {
			public void run() {
				System.out.println("Uruchomione przez: " + getName());
				CzekoladowyKociołKlasyczny kocioł = CzekoladowyKociołKlasyczny.pobierzInstancję();
				kocioł.napełniaj();
				kocioł.gotuj();
				kocioł.opróżniaj();
			}
		};
		wątek1.start();
		wątek2.start();
		Thread wątek1S = new Thread("Wątek 1S") {
			public void run() {
				System.out.println("Uruchomione przez: " + getName());
				CzekoladowyKociołSynchro kocioł = CzekoladowyKociołSynchro.pobierzInstancję();
				kocioł.napełniaj();
				kocioł.gotuj();
				kocioł.opróżniaj();
			}
		};
		Thread wątek2S = new Thread("Wątek 2S") {
			public void run() {
				System.out.println("Uruchomione przez: " + getName());
				CzekoladowyKociołSynchro kocioł = CzekoladowyKociołSynchro.pobierzInstancję();
				kocioł.napełniaj();
				kocioł.gotuj();
				kocioł.opróżniaj();
			}
		};
		wątek1S.start();
		wątek2S.start();
		Thread wątek1E = new Thread("Wątek 1E") {
			public void run() {
				System.out.println("Uruchomione przez: " + getName());
				CzekoladowyKociołEager kocioł = CzekoladowyKociołEager.pobierzInstancję();
				kocioł.napełniaj();
				kocioł.gotuj();
				kocioł.opróżniaj();
			}
		};
		Thread wątek2E = new Thread("Wątek 2E") {
			public void run() {
				System.out.println("Uruchomione przez: " + getName());
				CzekoladowyKociołEager kocioł = CzekoladowyKociołEager.pobierzInstancję();
				kocioł.napełniaj();
				kocioł.gotuj();
				kocioł.opróżniaj();
			}
		};
		wątek1E.start();
		wątek2E.start();
		Thread wątek1D = new Thread("Wątek 1D") {
			public void run() {
				System.out.println("Uruchomione przez: " + getName());
				CzekoladowyKociołDoubleLock kocioł = CzekoladowyKociołDoubleLock.pobierzInstancję();
				kocioł.napełniaj();
				kocioł.gotuj();
				kocioł.opróżniaj();
			}
		};
		Thread wątek2D = new Thread("Wątek 2D") {
			public void run() {
				System.out.println("Uruchomione przez: " + getName());
				CzekoladowyKociołDoubleLock kocioł = CzekoladowyKociołDoubleLock.pobierzInstancję();
				kocioł.napełniaj();
				kocioł.gotuj();
				kocioł.opróżniaj();
			}
		};
		wątek1D.start();
		wątek2D.start();
		Thread wątek1J = new Thread("Wątek 1J") {
			public void run() {
				System.out.println("Uruchomione przez: " + getName());
				CzekoladowyKociołJbloch kocioł = CzekoladowyKociołJbloch.INSTANCE;
				kocioł.napełniaj();
				kocioł.gotuj();
				kocioł.opróżniaj();
			}
		};
		Thread wątek2J = new Thread("Wątek 2J") {
			public void run() {
				System.out.println("Uruchomione przez: " + getName());
				CzekoladowyKociołJbloch kocioł = CzekoladowyKociołJbloch.INSTANCE;
				kocioł.napełniaj();
				kocioł.gotuj();
				kocioł.opróżniaj();
			}
		};
		wątek1J.start();
		wątek2J.start();
	}
}
