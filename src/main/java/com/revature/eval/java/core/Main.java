package com.revature.eval.java.core;

import java.util.Map;

public class Main {
	public static void main(String[] args) {
		EvaluationService es = new EvaluationService();
		String one = es.reverse("example");
		String two = es.acronym("Strategic Homeland Intervention, Enforcement Logistics Division");
		
		EvaluationService.Triangle et = new EvaluationService.Triangle(5,4,6);
		boolean three1 = et.isEquilateral();
		boolean three2 = et.isIsosceles();
		boolean three3 = et.isScalene();
		
		int four = es.getScrabbleScore("OxyphenButazone");
		
		String five = es.cleanPhoneNumber("+1 (613)-995-0253 ");
		
		Map<String, Integer> six = es.wordCount("one,\ntwo,\nthree");
		
		String eight = es.toPigLatin("fast run");
		

	}
}
