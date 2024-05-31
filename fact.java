package com.personal.demo;
import java.util.Scanner;
public class fact {
	
	public static int factorial(int n) {
		int f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;
		}
		return f;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a numeber:");
		int n=sc.nextInt();
		System.out.println(factorial(n));
	}

}
