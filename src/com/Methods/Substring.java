package com.Methods;

public class Substring {

	public static void main(String[] args) {
		String s="elephant";
		
		/*
		 * System.out.println(s.substring(3, 7)); System.out.println(s.substring(6));
		 * System.out.println(s.substring(1));
		 */
		
		String s1=s.substring(2);
		System.out.println(s1);
		System.out.println(s1.concat("animal"));

	}

}
