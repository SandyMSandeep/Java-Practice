package com.array.progs;
import java.util.Scanner;
public class twodarray_intro {
	
	public static boolean searcher(int mat[][],int key) {
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[0].length;j++) {
				if(mat[i][j]==key) {
					System.out.println("Found at:("+i+","+j+")");
					return true;
				}
			}
		}
		return false;
	}
	
	public static void smallest(int mat[][]) {
		int small=Integer.MAX_VALUE;
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[0].length;j++) {
				if(mat[i][j]<small) {
					small=mat[i][j];
				}
			}
		}
		System.out.println("Smallest element is:"+small);
	}
	
	public static void largest(int mat[][]) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[0].length;j++) {
				if(mat[i][j]>max) {
					max=mat[i][j];
				}
			}
		}
		System.out.println("Largest element is:"+max);;
	}
	public static void transpose(int mat[][]) {
		int transpose[][]=new int[mat[0].length][mat.length];
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[0].length;j++) {
				transpose[i][j]=mat[j][i];
			}
		}
		for(int i=0;i<transpose.length;i++) {
			for(int j=0;j<transpose[0].length;j++) {
			System.out.print(transpose[i][j]+" ");
			}
			System.out.println();
		}
		
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
		searcher(mat,key);
		smallest(mat);
		largest(mat);
		transpose(mat);
	}

}
