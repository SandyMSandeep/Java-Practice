package com.pattern.all;
import java.util.Scanner;

public class invrat {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int row=0;row<=n;row++) {
			for(int star=1;star<=n-row;star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
