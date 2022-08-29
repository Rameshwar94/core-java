package com.java8features;

@FunctionalInterface   //it will allow you to add only one abstract method in interface
interface Sayable{
	String say();//by default this method is  is public
	
}

public class LambdaWithNoPara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sayable s1=()->{return "Hello Lambda";};
		
		System.out.println(s1.say());/*at run time compiler will convert lambda into method with the help of functional interface
				                        public String say(){
				                        return "Hello Lambda";}*/
		
		
	}

}
