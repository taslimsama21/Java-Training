package com.taslim.PearsonCalculator;

import com.math.library.MathLibrary;
import junit.framework.Assert;
import static org.junit.Assert.*;
import org.junit.Test;

public class MathLibraryTest {

	double x = 600, y = 30;
	double valueOfX[] = { 20, 50, 30, 10, 80 };
	double valueOfY[] = { 80, 90, 50, 60, 30 };
	MathLibrary mb = new MathLibrary();

	@Test
	public void getSumOf() {
		double sum = mb.sumOf(valueOfX);
		Assert.assertEquals("Error in sumOf method ", 190.0, sum);
	}

	@Test
	public void getMeanOf() {
		double mean = mb.meanOf(valueOfX);
		Assert.assertEquals("error in getMeanOf method ", 38.0, mean);
	}

	@Test
	public void getDeviationOf() {
		double[] expectedDeviation = { -18.000, 12.000, -8.000, -28.000, 42.000 };
		double[] deviation = mb.deviationOf(valueOfX);
		assertArrayEquals("error in getDeviationOf method ", expectedDeviation, deviation, 0);
	}

	@Test
	public void getProductOfArray() {
		double[] expectedProductArray = { 1600, 4500, 1500, 600, 2400 };
		double[] productArray = mb.productOfAllElementsOfArray(valueOfX, valueOfY);
		assertArrayEquals("error in getproductOfEachElementInArray method", expectedProductArray, productArray, 0);
	}

	@Test
	public void getDivisionOf() {

		double division = mb.divisionOf(x, y);
		Assert.assertEquals("error in divisonOf method", 20.0, division);
	}

	@Test
	public void getSquarRootOf() {
		double squareRoot = mb.squareRootOf(x);

		Assert.assertEquals("error in getSquareRootOf method", 24.49489742783178, squareRoot);
	}

	@Test
	public void getProductOf() {
		double product = mb.productOf(x, y);
		Assert.assertEquals("error in getProductOf method ", 18000.0, product);
	}
}
