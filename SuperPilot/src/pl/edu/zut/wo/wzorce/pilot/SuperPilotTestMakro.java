package pl.edu.zut.wo.wzorce.pilot;

public class SuperPilotTestMakro {
    public static void main(String[] args) {
		SuperPilot superPilot = new FabrykaZaprogramowanySuperPilot().zbuduj();

		System.out.println(superPilot);

		superPilot.wcisnietoPrzyciskWlącz(5); // wylacz swiatla w domu

        System.out.println("Start imprezy: ");
        superPilot.wcisnietoPrzyciskWlącz(6); // zacznij impreze
        System.out.println("Koniec imprezy: ");

		superPilot.wcisnietoPrzyciskWycofaj(); // pojedli, popili to wiadomo co
        System.out.println(superPilot);
	}
}
