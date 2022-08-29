package com.java8features;

@FunctionalInterface
interface Sayable2{
	int add(int a,int b);
}
public class LambdaWithMultiPara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sayable2 s2=(x,y) -> {
			return x+y;};
			Sayable2 s3=(p,q)->p+q;
			
			System.out.println(s2.add(12, 12));
			System.out.println(s3.add(23, 34));
	}

}
