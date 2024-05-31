package com.array.progs;
import java.util.Scanner;
public class selection_sort_decending {
	
	public static void selectionsorting(int arr[],int n) {
		for(int i=0;i<n-1;i++) {
			int minPos=i;
			for(int j=i+1;j<n;j++) {
				if(arr[minPos]<arr[j])
					minPos=j;
			}
			//swapping
			int temp=arr[i];
			arr[i]=arr[minPos];
			arr[minPos]=temp;
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
		selectionsorting(arr,n);

	}

}
