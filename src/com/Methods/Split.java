package com.Methods;

public class Split {

	public static void main(String[] args) {
		String s="Archana";
		s=s.concat("Mahajan")+"..."+s.concat("Kalaskar");
		System.out.println(s);
		
		String [] ch=s.split("");
		System.out.println(ch.length);
		
	}

}

