package com.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationEx {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("c:\\\\users\\\\ram\\\\ser.txt"));
		Employee emp=(Employee) objectInputStream.readObject();
		System.out.println(emp);
		objectInputStream.close();

	}

}
