package com.personal.demo;
import java.util.Scanner;
public class ltoother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a long value here:");
		long l=sc.nextLong();
		int l1=(int)l;
		System.out.println("int is:"+l1);
		float l2=(float)l;
		System.out.println("float is:"+l2);
		double l3=(double)l;
		System.out.println("double is:"+l3);
		short l4=(short)l;
		System.out.println("short is:"+l4);
		byte l5=(byte)l;
		System.out.println("byte is:"+l5);
		sc.close();
	}

}
