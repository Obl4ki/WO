package pl.edu.zut.wo.wzorce.symulator;

public class WabikKaczka extends Kaczka {
	WabikKaczka() {
		this.kwakanieInterfejs = new NieKwacz();
		this.latanieInterfejs = new NieLatam();
	}

	public void wyświetl(){
		System.out.println("Wygląda jak płaskonos");
	}
}