package com.exception;

import com.oops.Arithmatic;

public class FinallyEx {

	public static void main(String[] args) {
		System.out.println("case 1:where exception doesn't occur");
		
		try {
			int c=10/5;
			System.out.println(c);
			
		}
		catch(Exception e){
		e.printStackTrace();
		}
		finally {
			System.out.println("case 1:it is always executed");
		}
		System.out.println("case 1:rest of code..");
		System.out.println("case 2:where exception occurs and Handled");
		
		try {
			int a[]=new int[5];
			a[7]=9;
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("case 2:it is always executed");
		}
		System.out.println("case 2:rest of code...");
		
		System.out.println("case 3:where exception occurs but does not handled");
		
		try {
			String s=null;
			System.out.println(s.length());
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("case 3:it is always executed");
			
		}
		System.out.println("case 3:rest of code...");
	}

}
