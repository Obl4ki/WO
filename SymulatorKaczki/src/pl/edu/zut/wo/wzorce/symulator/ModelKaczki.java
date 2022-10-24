package pl.edu.zut.wo.wzorce.symulator;

public class ModelKaczki extends Kaczka {
    public void zmienStrategieLatania(LatanieInterfejs strat) {
        this.latanieInterfejs = strat;
    }

    public void wyświetl(){
		System.out.println("Wygląda jak płaskonos");
	}
}
