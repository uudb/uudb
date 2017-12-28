package com.study.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		S s = new S();
		s.setS();
		S1 ss = new S1();
		ss.setS();
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("d://a.txt"));
		out.writeObject(s);
		out.writeObject(ss);
		out.close();
		ObjectInputStream oin = new ObjectInputStream(new FileInputStream("d://a.txt"));
		S s1 = (S) oin.readObject();
		S1 ss1 = (S1) oin.readObject();
		oin.close();
		System.out.println("父类序列化");
		s1.pp();
		s1.tt();
		System.out.println("父类没有序列化");
		ss1.pp();
		ss1.tt();
	}

}
