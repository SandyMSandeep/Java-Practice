package com.pattern.all;
import java.util.Scanner;
public class pattern {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	for(int i=1;i<=a;i++) {
		System.out.print("*");
		if(i%b==0)
			System.out.print("#");	
		}
	}
}
