package pl.edu.zut.wo.wzorce.pilot;

import pl.edu.zut.wo.wzorce.pilot.polecenia.*;

import pl.edu.zut.wo.wzorce.pilot.sterowniki.*;

public class SuperPilotProgramuj {

	public static void main(String[] args) {
		SuperPilot superPilot = new FabrykaZaprogramowanySuperPilot().zbuduj();

		

		System.out.println(superPilot);

		superPilot.wcisnietoPrzyciskWlącz(0);
		superPilot.wcisnietoPrzyciskWycofaj();
		superPilot.wcisnietoPrzyciskWylacz(0);
		superPilot.wcisnietoPrzyciskWlącz(1);
		superPilot.wcisnietoPrzyciskWylacz(1);
		superPilot.wcisnietoPrzyciskWlącz(2);
		superPilot.wcisnietoPrzyciskWylacz(2);
		superPilot.wcisnietoPrzyciskWlącz(3);
		superPilot.wcisnietoPrzyciskWylacz(3);
		superPilot.wcisnietoPrzyciskWlącz(4);
		superPilot.wcisnietoPrzyciskWylacz(4);
	}
}
