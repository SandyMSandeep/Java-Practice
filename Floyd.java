package com.pattern.all;
import java.util.Scanner;
public class Floyd {
	
	public static void printing(int n) {
		int counter=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(counter+" ");
				counter++;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		printing(rows);
	}

}
