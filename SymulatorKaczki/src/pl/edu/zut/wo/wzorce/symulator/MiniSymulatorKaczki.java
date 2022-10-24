package pl.edu.zut.wo.wzorce.symulator;

public class MiniSymulatorKaczki {

	public static void main(String[] args) {
		Kaczka dzika = new DzikaKaczka();
		dzika.wyświetl();
		dzika.kwacz();
		dzika.lec();

		System.out.println("\nGumowa kaczka");

		Kaczka gumowa = new GumowaKaczka();
		gumowa.wyświetl();
		gumowa.kwacz();
		gumowa.lec();

		System.out.println("\nPlaskonos kaczka");

		Kaczka plaskonos = new PlaskonosKaczka();
		plaskonos.wyświetl();
		plaskonos.kwacz();
		plaskonos.lec();
		
		System.out.println("\nWabik kaczka");

		Kaczka wabikKaczka = new WabikKaczka();
		wabikKaczka.wyświetl();
		wabikKaczka.kwacz();
		wabikKaczka.lec();


		System.out.println("\nStart testow modelu kaczki:");

		ModelKaczki modelKaczki = new ModelKaczki();
		modelKaczki.zmienStrategieLatania(new LotZNapedemRakietowym());
		modelKaczki.lec();

		modelKaczki.zmienStrategieLatania(new NieLatam());
		modelKaczki.lec();
	}
}
