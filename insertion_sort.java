package com.array.progs;

import java.util.Scanner;

public class insertion_sort {
	
	public static void isort(int arr[],int n) {
		for(int i=1;i<n;i++) {
			int curr=arr[i];
			int prev=i-1;
			while(prev>=0 && arr[prev]>curr) {
				arr[prev+1]=arr[prev];
				prev--;
			}
			arr[prev+1]=curr;
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			isort(arr,n);

	}

}
