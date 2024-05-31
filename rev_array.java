package com.array.progs;

import java.util.Scanner;

public class rev_array {
	
	public static void reversing(int arr[],int n) {
		int first=0,last=n-1;
		while(first < last ){
				int temp=arr[first];
				arr[first]=arr[last];
				arr[last]=temp;
				first++;
				last--;
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
		reversing(arr,n);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
