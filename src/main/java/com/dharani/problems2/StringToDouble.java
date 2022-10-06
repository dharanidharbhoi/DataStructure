package com.dharani.problems2;

public class StringToDouble {

	public static void main(String[] args) {


		System.out.println(getDoubleValue("123.123"));

	}

	private static double getDoubleValue(String string) {

		String[] strings = string.split("\\.");

		double afterDecimal = 0.0;

		double beforeDecimal = beforeDecimal(strings[0]);
		if (strings.length == 2) {

			afterDecimal = afterDecimal(strings[1]);
		}

		return afterDecimal + beforeDecimal;
	}

	private static double beforeDecimal(String string) {

		double result = 0;

		int multi = 1;

		if (string.startsWith("-")) {
			multi = -1;
			string = string.substring(1);
		}

		for (int i = 0; i < string.length(); i++) {

			int number = ((int) string.charAt(i)) - 48;

			result = result * 10 + number;
		}

		return result * multi;
	}

	public static double afterDecimal(String string) {

		double result = 0;

		double div = 1;

		for (int i = 0; i < string.length(); i++) {

			div = div * 10.0;

			int number = ((int) string.charAt(i)) - 48;

			result = result * 10 + number;
		}

		return result / div;
	}

}
