package pl.edu.zut.wi.wo.tea2;

public class ReadingRecord {
	String customer;
	int quantity;
	int month;
	int year;

	public double baseRate;
	public double taxThreshold;
	public double calculateBaseCharge;

	public void transform() {
		this.baseRate = baseRate();
		this.taxThreshold = taxThreshold();
		this.calculateBaseCharge = calculateBaseCharge(this.quantity);
	}

	private static double calculateBaseCharge(int quantity) {
		return baseRate() * quantity;
	}

	private static double taxThreshold() {
		return 100;
	}

	private static double baseRate() {
		return 12.5;
	}

}
