package com.personal.demo;
import java.util.Scanner;
public class checkprime {
	
	public static boolean check(int n) {
		if(n==2)
			return true;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean b=check(n);
		if(b==true)
		System.out.println("Number is Prime");
		else
		System.out.println("Number is Composite");

	}

}
