package com.array.progs;
import java.util.*;
public class linear_Search {
	
	public static int ls(int arr[],int n,int key){
		for(int i=0;i<n;i++) {
			if(arr[i]==key)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int key=sc.nextInt();
		int index=ls(arr,n,key);
		if(index==-1) {
			System.out.println("Not Found");
		}
		else {
			System.out.println("Found at index:"+index);	
	}
	}

}
