package com.taslim.PearsonCalculator;

import com.math.library.MathLibrary;

public class PearsonCalculator {

	public static void main(String[] args) {
		double valueOfX[] = {10,20,30,40,56};
		double valueOfY[] = {11,22,33,44,55};
		MathLibrary calc = new MathLibrary();
		System.out.println("Result of R: "+calc.corellationCoefficient(valueOfX,valueOfY));
	}
}
