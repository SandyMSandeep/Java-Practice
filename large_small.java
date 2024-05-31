package com.array.progs;
import java.util.*;
public class large_small {
	
	public static int large(int arr[],int n) {
		int large=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(large<=arr[i]) {
				large=arr[i];
			}
		}
		return large;
	}
	
	public static int small(int arr[],int n) {
		int small=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			if(small>=arr[i]) {
				small=arr[i];
			}
		}
		return small;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Largest numb is; "+large(arr,n));
		System.out.println("Smallest value is:"+small(arr,n));
;	}

}
