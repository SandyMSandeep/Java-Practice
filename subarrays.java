package com.array.progs;

import java.util.Scanner;

public class subarrays {
	
	public static int subs(int arr[],int n) {
		int total=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int k=i;k<=j;k++) {
					System.out.print(arr[k]);
				}
				total++;
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("Total sub arrays are:"+total);
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		subs(arr,n);
	}

}
