package com.yahoo.romannumeral;

import com.github.mz.romannumeral.RomanNumeral;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class RomanNumeralTest extends TestCase {

	/**
	 * Create the test case
	 * 
	 * @param testName
	 *            name of the test case
	 */
	public RomanNumeralTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(RomanNumeralTest.class);
	}

	public void test_for_I() {
		RomanNumeral romanNumeral = new RomanNumeral();

		assertEquals(1L, romanNumeral.convertToNumber("I"));

	}

	public void test_for_II() {
		RomanNumeral romanNumeral = new RomanNumeral();

		assertEquals(2L, romanNumeral.convertToNumber("II"));

	}

	public void test_for_IV() {
		RomanNumeral romanNumeral = new RomanNumeral();

		assertEquals(4L, romanNumeral.convertToNumber("IV"));

	}

	public void test_for_V() {
		RomanNumeral romanNumeral = new RomanNumeral();

		assertEquals(5L, romanNumeral.convertToNumber("V"));

	}

	public void test_for_IX() {
		RomanNumeral romanNumeral = new RomanNumeral();

		assertEquals(9L, romanNumeral.convertToNumber("IX"));

	}

	public void test_for_VII() {
		RomanNumeral romanNumeral = new RomanNumeral();

		assertEquals(7L, romanNumeral.convertToNumber("VII"));

	}

	public void test_for_CM() {
		RomanNumeral romanNumeral = new RomanNumeral();

		assertEquals(900L, romanNumeral.convertToNumber("CM"));

	}

	public void test_for_XLVII() {
		RomanNumeral romanNumeral = new RomanNumeral();

		assertEquals(47L, romanNumeral.convertToNumber("XLVII"));

	}

	public void test_for_MMVIII() {
		RomanNumeral romanNumeral = new RomanNumeral();

		assertEquals(2008L, romanNumeral.convertToNumber("MMVIII"));

	}

	public void test_for_MCMXC() {
		RomanNumeral romanNumeral = new RomanNumeral();

		assertEquals(1990L, romanNumeral.convertToNumber("MCMXC"));

	}

	public void test_for_MMVIIIC() {
		RomanNumeral romanNumeral = new RomanNumeral();

		assertEquals(2008L, romanNumeral.convertToNumber("MMVIII"));

	}

	public void test_for_MCMLII() {
		RomanNumeral romanNumeral = new RomanNumeral();

		assertEquals(1952L, romanNumeral.convertToNumber("MCMLII"));

	}

	public void test_for_XIX() {
		RomanNumeral romanNumeral = new RomanNumeral();

		assertEquals(19L, romanNumeral.convertToNumber("XIX"));

	}

	public void test_for_XX() {
		RomanNumeral romanNumeral = new RomanNumeral();

		assertEquals(20L, romanNumeral.convertToNumber("XX"));

	}

	public void test_for_IXX() {
		RomanNumeral romanNumeral = new RomanNumeral();
		try {
			romanNumeral.convertToNumber("IXX");
			Assert.fail("Should throw exception");
		} catch (IllegalArgumentException e) {

		}
	}

	public void test_for_Null() {
		RomanNumeral romanNumeral = new RomanNumeral();
		try {
			romanNumeral.convertToNumber(null);
			Assert.fail("Should throw exception");
		} catch (IllegalArgumentException e) {

		}
	}

	public void test_for_EmptyString() {
		RomanNumeral romanNumeral = new RomanNumeral();
		try {
			romanNumeral.convertToNumber("");
			Assert.fail("Should throw exception");
		} catch (IllegalArgumentException e) {

		}
	}

	public void test_for_IllegalString() {
		RomanNumeral romanNumeral = new RomanNumeral();
		try {
			romanNumeral.convertToNumber("asad");
			Assert.fail("Should throw exception");
		} catch (IllegalArgumentException e) {

		}
	}

}
