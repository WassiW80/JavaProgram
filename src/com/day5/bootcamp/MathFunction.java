package com.day5.bootcamp;

public class MathFunction {

	static double harmonicNumber(int n) {
		double h = 1;
		for (int i = 2; i <= n; i++) {
			h = h + ((float) 1 / i);
		}
		return h;

	}

	static double sin(int angle) {
		double radian = Math.toRadians(angle);
		double sin = Math.sin(radian);
		return sin;
	}

	static double cosine(int angle) {
		double radian = Math.toRadians(angle);
		double cos = Math.cos(radian);
		return cos;
	}

	static String binary(int decimal) {
		String bin = "";
		while (decimal > 0) {
			bin = decimal % 2 + bin;
			decimal = decimal / 2;
		}

		while (bin.length() % 4 != 0) {
			bin = 0 + bin;
		}
		return bin;
	}

	static double sqrt(double c) {
		double t = c;
		double epsilon = 1e-15;
		while (Math.abs(t - (c / t)) > epsilon * t) {
			t = c / t + t / 2.0;
		}
		return t;
	}

	static double sqrt(double c, double epsilon) {
		double t = c;
		while (Math.abs(t - (c / t)) > epsilon * t) {
			t = c / t + t / 2.0;
		}
		return t;
	}

	static boolean isPrime(int num) {
		if (num % 2 != 0 && num % 3 != 0 && num % 5 != 0 && num % 7 != 0) {
			return true;
		} else if (num == 2 || num == 3 || num == 5 || num == 7) {
			return true;
		}
		return false;
	}

	static long factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

	static double futureValue(double C, double r, double t) {
		r = r / 100;
		return C * Math.pow((1 + r), t);

	}

	static double presentValue(double c, double r, double t) {
		r = r / 100;
		return c / Math.pow((1 + r), t);
	}

	static int minValue(int arr[]) {
		int min = 100;
		for (int i = 0; i < arr.length; i++) {
			min = Math.min(min, arr[i]);
		}
		return min;
	}

	static int maxValue(int arr[]) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		return max;
	}

	static String minValue(String string[]) {
		String min = "hfjdsfkdhfhfdjdfkjfj";
		for (int i = 0; i < string.length; i++) {
			if (min.compareTo(string[i]) > 0) {
				min = string[i];
			}
		}
		return min;
	}

	static String maxValue(String string[]) {
		String max = "";
		for (int i = 0; i < string.length; i++) {
			if (max.compareTo(string[i]) < 0) {
				max = string[i];
			}
		}
		return max;
	}

	static boolean checkCollinearUsingSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
		double ab = (y2 - y1) / (x2 - x1);
		double bc = (y3 - y2) / (x3 - x2);
		double ac = (y3 - y1) / (x3 - x1);
		if (ab == bc && bc == ac) {
			return true;
		}
		return false;
	}

	static boolean checkCollinearUsingArea(int x1, int y1, int x2, int y2, int x3, int y3) {
		double a = 0.5*(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
		if (a == 0) {
			return true;
		}
		return false;
	}
}
