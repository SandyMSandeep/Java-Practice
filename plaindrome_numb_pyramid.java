package com.pattern.all;
import java.util.Scanner;
public class plaindrome_numb_pyramid {
	
	public static void printing(int n) {
		for(int i=1;i<=n;i++) {
			//spaces
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//descending
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			//ascending
			for(int j=2;j<=i;j++) {
			System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		printing(n);

	}

}
