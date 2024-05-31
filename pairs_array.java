package com.array.progs;

import java.util.Scanner;

public class pairs_array {
	
	public static void pairs(int arr[],int n) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				System.out.print("("+arr[i]+","+arr[j]+")");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		pairs(arr,n);
	}

}
