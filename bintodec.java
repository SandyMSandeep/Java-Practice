package com.personal.demo;
import java.util.Scanner;
public class bintodec {
	public static double todec(int bin) {
		int pow=0;
		double dec=0;
		while(bin>0) {
			int ld=bin%10;
			dec=dec+(ld * Math.pow(2, pow));
			
			pow++;
			bin=bin/10;
		}
		return dec;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int bin=sc.nextInt();
		System.out.println(todec(bin));
	}

}
