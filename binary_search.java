package com.array.progs;

import java.util.Scanner;

public class binary_search {
	
	public static int bin(int arr[],int n,int key) {
		int start=0,end=n-1;
		
		while(start <= end) {
			int mid=(start+end)/2;
			if(arr[mid]==key) 
				return mid;
			if(arr[mid] < key) {
				start = mid+1;
			}
			else {
				end = mid-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter a Sorted Array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int key=sc.nextInt();
		sc.close();
		System.out.println("Found at index : "+bin(arr,n,key));
	}

}
