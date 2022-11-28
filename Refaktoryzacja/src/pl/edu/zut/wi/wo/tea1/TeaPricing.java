package pl.edu.zut.wi.wo.tea1;

public class TeaPricing {
    protected static double taxThreshold() {
		return 100.;
	}

	protected static double baseRate() {
		return 12.5;
	}

    
	protected static double calculateBaseCharge(int quantity) {
		return baseRate() * quantity;
	}


}
