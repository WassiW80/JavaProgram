package com.day2.bootcamp;

public class Stats5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] array = new double[5];
		double avg = 0, min = 1, max = 0;
		int i = 0;
		for (i = 0; i < 5; i++) {
			array[i] = Math.random();
			avg = avg + array[i];
			min = Math.min(min, array[i]);
			max = Math.max(max, array[i]);
			System.out.println(array[i]);
		}
		avg = avg / 5;

		// min=Math.min(array[i], array[i+1]);
		System.out.println("Average " + avg);
		System.out.println("Minimum " + min);
		System.out.println("Maximum " + max);
	}

}
