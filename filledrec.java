package com.pattern.all;
import java.util.Scanner;

public class filledrec {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int b=sc.nextInt();
		for(int i=1;i<=l;i++) {
			for(int j=1;j<=b;j++) {
				System.out.print("*");
			}
		System.out.println();
		}					
	}
}
/*
import java.util.Scanner;

public class filledrec {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int b=sc.nextInt();
		for(int i=1;i<=l;i++) {
				System.out.print("*");
				if(i%b==0) {
					System.out.println("");
				}	
		}
	}
} */