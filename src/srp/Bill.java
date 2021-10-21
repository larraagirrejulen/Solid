package srp;

import java.util.Date;

public class Bill {

	public String code;
	public Date billDate;
	public float billAmount;
	public float billDeduction;
	public float billTotal;
	public float VAT;
	public int deductionPercentage;
	
	// Fakturaren totala kalkulatzen duen metodoa.
	public void totalCalc() {
	
		// Dedukzioa kalkulatu
		BillDeduction cbd = new BillDeduction(billAmount, deductionPercentage);
		billDeduction = cbd.calculateBillDeduction();
		
		// VAT kalkulatzen dugu
		Vat cvat = new Vat(billAmount);
		VAT = cvat.calculateVAT();
		
		// Totala kalkulatzen dugu
		billTotal = billAmount - billDeduction + VAT;
	}
	
}
