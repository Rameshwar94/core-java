package com.collection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx {

	public static void main(String[] args) throws IOException {
		FileReader reader=new FileReader("D:\\study\\course\\java\\git-sourcecode\\core-java\\src\\com\\collection\\db.properties");
		
		Properties p=new  Properties();
		p.load(reader);
		System.out.println("username:"+p.getProperty("username"));
		System.out.println("password:"+p.getProperty("password"));
	}

}
