package dip;

import java.util.HashMap;

public class Student { 
	public String name; 
	public String sex; 
	public String year; 
	// matrikulatuta dagoen espedientea  
	public HashMap<String,Integer> subjectRecord; 
	// ikasleak ordaindu behar duena  
	public String toCharge; 
	
	// Irakasgai batean matrikulatzen duen metodoa.  
	public void register(String subject, PreconditionChecker preCheck, DeductionCalculator deductCalc, SubjectPriceCalculator subjPriceCalc) { 
		// Aurrebaldintzak konprobatzen dira 
		boolean isPosible = preCheck.isPosible(subject , subjectRecord); 
		if (isPosible) {  
			// Dedukzioa kalkulatu sex eta edadearen arabera 
			int percentage = deductCalc.calcDeduction(sex, year); 
			// Irakasgaiaren prezioa lortu  
			int quote = subjPriceCalc.getPrice(subject); 
			// HashMap batean gordetzen du eta ordaindu behar duen balioa eguneratu 
			subjectRecord.put(subject,null); 
			toCharge = toCharge+(quote-percentage*quote/100); 
		} 
	} 
}
