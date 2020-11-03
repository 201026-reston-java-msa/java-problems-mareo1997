package com.revature.eval.java.core;

import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		EvaluationService es = new EvaluationService();

		String one = es.reverse("example");

		System.out.println();
		
		String two = es.acronym("Strategic Homeland Intervention, Enforcement Logistics Division");
		
		System.out.println();
		
		EvaluationService.Triangle et = new EvaluationService.Triangle(5,4,6);
		boolean three1 = et.isEquilateral();
		boolean three2 = et.isIsosceles();
		boolean three3 = et.isScalene();
		
		System.out.println();
		
		int four = es.getScrabbleScore("OxyphenButazone");
		
		System.out.println();
		
		String five = es.cleanPhoneNumber("+1 (613)-995-0253 ");
		
		System.out.println();		
		
		Map<String, Integer> six = es.wordCount("one,\ntwo,\nthree");
		
		System.out.println();
		
		String eight = es.toPigLatin("quick fast run");

		System.out.println();

		boolean nine = es.isArmstrongNumber(153);
		
		System.out.println();
		
		//List<Long> ten = es.calculatePrimeFactorsOf(12);
		//boolean a = es.prime(2);
		
		System.out.println();
		
		int tweleve = es.calculateNthPrime(13);

		System.out.println();

		int twenty1 = es.solveWordProblem("What is 5 plus 13?");
		int twenty2 = es.solveWordProblem("What is 7 minus 5?");
		int twenty3 = es.solveWordProblem("What is 6 multiplied by 4?");
		int twenty4 = es.solveWordProblem("What is 25 divided by 5?");
		
		

	}
}
