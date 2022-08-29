package com.practice;

public class ByteEx {
	public static void main(String args[]) 
    {
        Integer i = new Integer(257);  
        byte x = i.byteValue();//it exceeds byte range by 1 so it gives 1 as output
        System.out.print(x);
    }

}
