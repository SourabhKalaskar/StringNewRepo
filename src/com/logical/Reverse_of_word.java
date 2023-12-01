package com.logical;

public class Reverse_of_word {

	public static void main(String[] args) {
	String s="Archana Sourabh Kalaskar";
	
	String[] sh = s.split(" ");
	String rev="";
	System.out.println(sh.length);
	
	for(int i=0;i<sh.length;i++)
	{
		for(int j=sh[i].length()-1;j>=0;j--)
		{
			 rev=rev+sh[i].charAt(j);
		}
		rev=rev+" ";
	}
	System.out.print(rev);
	}

}
