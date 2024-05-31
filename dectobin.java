package com.personal.demo;
import java.util.Scanner;
public class dectobin {
	
	public static int tobin(int dec) {
		int po=0;
		int bin=0;
		while(dec>0) {
			int rem=dec%2;
			bin=bin+(rem*(int)Math.pow(10, po));
			
			po++;
			dec=dec/2;
		}
		return bin;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int dec=sc.nextInt();
		System.out.println(tobin(dec));
	}

}
