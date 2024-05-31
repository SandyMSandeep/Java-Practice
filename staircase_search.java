package com.array.progs;

import java.util.Scanner;

public class staircase_search {
	
	public static boolean search(int mat[][],int key) {
		int row=0;
		int col=mat[0].length-1;
		
		while(row < mat.length && col >= 0) {
			if(mat[row][col]==key) {
				System.out.println("Found at index ("+row+","+col+")");
				return true;
			}
			else if(key<mat[row][col])
				col--;
			else
				row++;
		}
		System.out.println("Not Found");
		return false;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int mat[][]=new int[n][m];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
			System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.print("Enter a number to find:");
		int key=sc.nextInt();
		search(mat,key);
	}

}
