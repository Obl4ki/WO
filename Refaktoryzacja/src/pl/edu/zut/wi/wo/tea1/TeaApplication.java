package pl.edu.zut.wi.wo.tea1;

public class TeaApplication {

	public static void main(String[] args) {
		System.out.println(String.format("firstMethod=%.2f", firstMethod()));
		System.out.println(String.format("secondMethod=%.2f", secondMethod()));
		System.out.println(String.format("thirdMethod=%.2f", thirdMethod()));
	}

	public static double firstMethod() {
		ReadingRecord aReading = acquireReading();
		double baseCharge = TeaPricing.baseRate() * aReading.quantity;
		return baseCharge;
	}

	public static double secondMethod() {
		ReadingRecord aReading = acquireReading();
		double base = (TeaPricing.baseRate() * aReading.quantity);
		double taxableCharge = Math.max(0, base - TeaPricing.taxThreshold());
		return taxableCharge;
	}

	public static double thirdMethod() {
		ReadingRecord aReading = acquireReading();
		double basicChargeAmount = TeaPricing.calculateBaseCharge(aReading.quantity);
		return basicChargeAmount;
	}

	private static ReadingRecord acquireReading() {
		ReadingRecord reading = new ReadingRecord();
		reading.customer = "ivan";
		reading.quantity = 10;
		reading.month = 2;
		reading.year = 2019;
		return reading;
	}
}
