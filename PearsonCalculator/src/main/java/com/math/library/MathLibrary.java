package com.math.library;

public class MathLibrary {

	double[] valueOfX, valueOfY;

	public double sumOf(double[] valueOfX) {
		double sum = 0;
		for (double element : valueOfX) {
			sum = sum + element;
		}
		return sum;
	}

	public double meanOf(double[] valueOfX) {
		double mean = (sumOf(valueOfX)) / valueOfX.length;
		return mean;
	}

	public double[] deviationOf(double[] valueOfX) {

		double tempArray[] = new double[valueOfX.length];
		int count = 0;
		for (double elementOfArray : valueOfX) {
			tempArray[count] = valueOfX[count] - meanOf(valueOfX);
			count++;
		}
		return tempArray;

	}

	public double[] productOfAllElementsOfArray(double[] valueOfX, double[] valueOfY) {
		double tempArray[] = new double[valueOfX.length];
		int count = 0;
		for (double elementOfArray : valueOfX) {
			tempArray[count] = valueOfX[count] * valueOfY[count];
			count++;
		}
		return tempArray;

	}

	public double divisionOf(double result1, double result2) {
		return result1 / result2;
	}

	public double squareRootOf(double number) {
		return Math.sqrt(number);
	}

	public double productOf(double x, double y) {
		return x * y;
	}

	public double corellationCoefficient(double[] valueOfX, double[] valueOfY) {
		double result1 = sumOf(productOfAllElementsOfArray(deviationOf(valueOfX), deviationOf(valueOfY)));
		double result2 = squareRootOf(
				productOf(sumOf(productOfAllElementsOfArray(deviationOf(valueOfX), deviationOf(valueOfX))),
						sumOf(productOfAllElementsOfArray(deviationOf(valueOfY), deviationOf(valueOfY)))));
		double corelationCoefficient = divisionOf(result1, result2);
		return corelationCoefficient;
	}

}
