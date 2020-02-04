package com.day1.home;

public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x,y,dist;
		x=Integer.parseInt(args[0]);
		y=Integer.parseInt(args[1]);
		dist=Math.sqrt((Math.pow(x,x)+Math.pow(y, y)));
		System.out.println(dist);
	}

}
