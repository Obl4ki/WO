package pl.edu.zut.wo.wzorce.symulator;

public class DzikaKaczka extends Kaczka {
	DzikaKaczka() {
		this.kwakanieInterfejs = new Kwacz();
		this.latanieInterfejs = new LatamBoMamSkzydla();
	}

	@Override
	public void wyświetl() {
		System.out.println("Wygląda jak dzika kaczka");
	}
}