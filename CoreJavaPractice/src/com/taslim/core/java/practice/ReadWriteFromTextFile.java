package com.taslim.core.java.practice;

//6.Write a program to read whole data from one text file and write it to another text file. 
import java.io.*;

public class ReadWriteFromTextFile {
	public static void main(String[] args) throws IOException {
		try {
			File f1 = new File("C:\\Users\\taslim.sama\\Downloads\\Tas.txt");
			File f2 = new File("C:\\Users\\taslim.sama\\Downloads\\Sama.txt");

			FileInputStream fi = new FileInputStream(f1);
			FileOutputStream fo = new FileOutputStream(f2);

			byte buf[] = new byte[1024];

			int l;
			while ((l = fi.read(buf)) > 0) {

				fo.write(buf);
			}
			System.out.println("File Copied!!");
		}

		catch (Exception e) {
			System.out.print("Error");
		}

	}

}