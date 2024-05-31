package com.array.progs;

import java.util.Scanner;

public class max_sumof_subarray {
	
	public static void subs(int arr[],int n) {
		int sum,max=Integer.MIN_VALUE;
		int prefix[]= new int[n];
		prefix[0]=arr[0];
		//prefix array
		for(int i=1;i<n;i++) {
			prefix[i]=prefix[i-1]+arr[i];
		}
		
		for(int i=0;i<n;i++) {
			int start=0;
			for(int j=i+1;j<n;j++) {
				int end=j;
				
				sum= start==0 ? prefix[end]: prefix[end]-prefix[start-1];
				
				if(max<sum)
					max=sum;
			}
		}
		System.out.println("Max Sum is:"+max);
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
