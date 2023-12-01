package com.logical;

public class Reverse {

	public static void main(String[] args) {
		String s="Archana";
		String rev="";
		char[] ch= s.toCharArray();
		System.out.println(ch.length);
		
		for(int i=ch.length-1;i>=0;i--)
		{
			rev=rev+ch[i];
			
		}
		System.out.println(rev);
	}

}

