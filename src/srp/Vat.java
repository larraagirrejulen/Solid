package srp;

public class Vat {

	private double value = 0.16;
	private float billAmount;
	
	public Vat(float billAmount) {
		this.billAmount = billAmount;
	}
	
	public double getValue() {
		return value;
	}

	public void setVat(double value) {
		this.value = value;
	}

	public float getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(float billAmount) {
		this.billAmount = billAmount;
	}

	public float calculateVAT() {
		return (float) (billAmount * value);
	}
	
}
