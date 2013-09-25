package com.github.mz.romannumeral;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {

	private Map<String, Symbol> lookup = new HashMap<String, Symbol>();

	public RomanNumeral() {
		init();
	}

	private void init() {
		for (Symbol symbol : Symbol.values()) {
			lookup.put(symbol.name(), symbol);
		}

	}

	public long convertToNumber(String input) throws IllegalArgumentException {

		if (input == null || input.equals("")) {
			throw new IllegalArgumentException(
					"input can not be null or empty String");
		}

		long result = 0;

		char[] inputArr = input.toCharArray();

		int lastIndex = inputArr.length - 1;

		String key = "";

		char firstChar, secondChar;

		long weight = 0l, previousWeight = Long.MAX_VALUE;

		for (int i = 0; i <= lastIndex;) {

			firstChar = inputArr[i];
			secondChar = ' ';
			weight = -1l;

			if ((lastIndex - i) > 0) {
				secondChar = inputArr[i + 1];
				key = firstChar + "" + secondChar;
				if (lookup.containsKey(key)) {
					weight = lookup.get(key).weight;
					i = i + 2;
				} else {
					key = firstChar + "";
					if (lookup.containsKey(key)) {
						weight = lookup.get(key).weight;
						i = i + 1;
					} else {
						throw new IllegalArgumentException(
								"Illegeal roman string at position:" + i);
					}
				}
			} else {
				key = firstChar + "";
				if (lookup.containsKey(key)) {
					weight = lookup.get(key).weight;
					i = i + 1;
				} else {
					throw new IllegalArgumentException(
							"Illegeal roman string at position:" + i);
				}
			}

			if (previousWeight >= weight) {
				result = result + weight;
				previousWeight = weight;
			} else {
				throw new IllegalArgumentException(
						"Illegeal roman string at position:" + i);
			}

		}
		return result;
	}
}
