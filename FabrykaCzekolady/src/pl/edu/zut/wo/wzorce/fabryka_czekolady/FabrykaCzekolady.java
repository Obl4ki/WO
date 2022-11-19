package pl.edu.zut.wo.wzorce.fabryka_czekolady;

public class FabrykaCzekolady {

	public static void main(String... params) {
		CzekoladowyKocioł kocioł1 = CzekoladowyKocioł.INSTANCE;
		kocioł1.napełniaj();
		kocioł1.gotuj();
		kocioł1.opróżniaj();
  
	}
}
