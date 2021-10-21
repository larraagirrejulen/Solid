package srp;

public class BillDeduction {

	private float billAmount;
	private int deductionPercentage;
	
	public BillDeduction(float billAmount, int deductionPercentage) {
		this.billAmount = billAmount;
		this.deductionPercentage = deductionPercentage;
	}
	
	public float getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(float billAmount) {
		this.billAmount = billAmount;
	}
	
	public int getDeductionPercentage() {
		return deductionPercentage;
	}

	public void setDeductionPercentage(int deductionPercentage) {
		this.deductionPercentage = deductionPercentage;
	}

	public float calculateBillDeduction() {
		return (billAmount * deductionPercentage) / 100;
	}

}
