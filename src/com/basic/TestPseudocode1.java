package com.basic;

public class TestPseudocode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Q1.
		int Integer = 24;
		char String  ='I';
		System.out.print(Integer);
		System.out.println(String);
		//Q2.
		
	/*	short x = 10;
        x =  (x * 5);//we need to cast the type to short
        System.out.println( x);*/
		//Ans:complile time error type conversion
		//solution:
		short x = 10;
        x =  (short) (x * 5);//we need to cast the type to short
        System.out.println( x);
		
        //Q3.
        byte y = 127;
        y++;//-128
        y++;//-127
        System.out.println(y);//-127
        //Range of byte data in java is -128 to 127. But the byte data type in java is cyclic in nature.
        
        //Q4.
        int[]  z = {120, 200, 016};
        for(int i = 0; i < z.length; i++){
                 System.out.print(z[i] + " ");//ans:120,200,016
                 //Any number prefixed with a 0 is considered octal. Octal numbers can only use digits 0-7
                 //16=1*8^1+6*8^0=14
            
        }                   
	}

}
