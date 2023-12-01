package com.Methods;

public class ToChrArray {

	public static void main(String[] args) {
		String s="Mahajan";
		char[] ch = s.toCharArray();
		
		
		
		  for(int i=0;i<ch.length;i++)
		  {
			  System.out.println(ch[i]);
		  }
		 
		for (int i =ch.length-1;i>=0; i--) 
		{
			System.out.print(ch[i]);
		}
	}
	}
	
