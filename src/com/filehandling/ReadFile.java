package com.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		FileInputStream inputStream=new FileInputStream("C:\\\\Users\\\\Ram\\\\test.txt");
		int i=0;
		while((i=inputStream.read())!=-1) // at the end of file returns -1 
		{
			System.out.print((char)i);//use print instead of println.typecasting int i to char
			
		}
		inputStream.close();
	}

}
