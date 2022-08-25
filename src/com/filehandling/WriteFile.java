package com.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		FileOutputStream outputStream=new FileOutputStream("C:\\Users\\Ram\\test.txt",true);//true allows to append the content
		String str="Welcome to Edubridge";//you can take string from user also
		byte bArr[]=str.getBytes();//converting string into byte
		outputStream.write(bArr);
		outputStream.close();
		System.out.println("File is created check at location");
		
	}

}
