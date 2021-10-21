package srp;

public class CalculateVAT {

	public double VAT = 0.16;
	
	public float calculatorVAT(float billAmount, double VAT) {
		return (float) (billAmount * 0.16);
	}

	public double getVAT() {
		return VAT;
	}

	public void setVAT(double VAT) {
		this.VAT = VAT;
	}
	
}
