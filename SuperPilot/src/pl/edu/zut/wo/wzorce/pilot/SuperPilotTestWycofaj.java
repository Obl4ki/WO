package pl.edu.zut.wo.wzorce.pilot;

public class SuperPilotTestWycofaj {
    public static void main(String[] args) {
		SuperPilot superPilot = new FabrykaZaprogramowanySuperPilot().zbuduj();

		System.out.println(superPilot);

		superPilot.wcisnietoPrzyciskWlącz(0);
        superPilot.wcisnietoPrzyciskWlącz(1); // wlacz swiatlo w kuchni
		superPilot.wcisnietoPrzyciskWycofaj(); // wycofaj wlaczenie swiatla w kuchni
        System.out.println(superPilot);
	}
}
