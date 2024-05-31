package com.personal.demo;
import java.util.Scanner;
public class bincoeff {
	
	public static int factorial(int n) {
		int f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;
		}
		return f;
	}
	
	public static void bincoeff(int n,int r) {
		int a=factorial(n);
		int b=factorial(r);
		int c=factorial(n-r);
		int bc=a/(b*c);
		System.out.println(bc);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		bincoeff(n,r);
	}

}
