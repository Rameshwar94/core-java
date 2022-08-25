package com.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx {

	public static void main(String[] args) throws IOException {
		
	Employee emp=new Employee(101,"Premala");
		
		FileOutputStream outputStream=new FileOutputStream("c:\\users\\ram\\ser.txt");
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);
		
		objectOutputStream.writeObject(emp);
		objectOutputStream.flush();
		System.out.println("converted into stream check file");
	}

}
