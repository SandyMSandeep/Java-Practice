package com.array.progs;
import java.util.Scanner;
// It works but not in eclipse
public class counting_sort {
	
	public static void countsort(int arr[],int n) {
		//int largest = Integer.MIN_VALUE;
		int largest = 0;
		for (int i = 0; i < n; i++) {
		    largest = Math.max(largest, arr[i]);
		}

		int count[]=new int[largest+1];
		for(int i=0;i<n;i++) {
			count[arr[i]]++;
		}
		
		int j=0;
		for(int i=0;i<count.length;i++) {
			while(count[i]>0) {
				arr[j]=i;
				j++;
				count[i]--;
			}
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
		sc.close();
		countsort(arr,n);

	}

}
