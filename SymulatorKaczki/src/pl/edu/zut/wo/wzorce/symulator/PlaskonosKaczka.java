package pl.edu.zut.wo.wzorce.symulator;

public class PlaskonosKaczka extends Kaczka {
	PlaskonosKaczka() {
		this.kwakanieInterfejs = new Kwacz();
		this.latanieInterfejs = new NieLatam();
	}

	public void wyświetl(){
		System.out.println("Wygląda jak płaskonos");
	}
}