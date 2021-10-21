package srp;

public class CalculateBillDeduction {

	public float billDeduction;
	public float billAmount;
	public int deductionPercentage;
	
	public float calculatorBillDeduction(float billAmount, int deductionPercentage) {
		return (billAmount * deductionPercentage) / 100;
	}

}
