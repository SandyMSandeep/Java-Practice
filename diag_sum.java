package com.array.progs;

import java.util.Scanner;

public class diag_sum {
	
	public static int sumstyle1(int mat[][]) {
		int sum=0;
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[0].length;j++) {
				if(i==j)
					sum+=mat[i][j];
				else if(i+j==mat.length-1)
					sum+=mat[i][j];
			}
		}
		return sum;
	}
	
	public static int sumstyle2(int mat[][]) {
		int sum=0;
		for(int i=0;i<mat.length;i++) {
				sum+=mat[i][i];
			if(i != mat.length-1-i)
				sum+=mat[i][mat.length-1-i];
			}
		return sum;
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
		System.out.println(sumstyle1(mat));
		System.out.println(sumstyle2(mat));
	}
}
