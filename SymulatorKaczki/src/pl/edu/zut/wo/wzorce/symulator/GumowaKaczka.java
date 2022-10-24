package pl.edu.zut.wo.wzorce.symulator;


public class GumowaKaczka extends Kaczka {
	GumowaKaczka() {
		this.kwakanieInterfejs = new Piszcz();
		this.latanieInterfejs = new NieLatam();
	}

	public void wyświetl(){
		System.out.println("Wygląda jak gumowa kaczka");
	}
}