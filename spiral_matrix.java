package com.array.progs;

import java.util.Scanner;

public class spiral_matrix {
	
	public static void spiral(int mat[][]) {
		int startRow=0;
		int startCol=0;
		int endRow=mat.length-1;
		int endCol=mat[0].length-1;
		while(startRow <= endRow && startCol <= endCol ) {
		//top
		for(int j=startCol;j<=endCol;j++) {
			System.out.print(mat[startRow][j]+" ");
		}
		//right
		for(int i=startRow+1;i<=endRow;i++) {
			System.out.print(mat[i][endCol]+" ");
		}
		//bottom
		for(int j=endCol-1; j>=startCol; j--) {
			if(startRow==endRow)
				break;
			System.out.print(mat[endRow][j]+" ");
		}
		//left
		for(int i=endRow-1; i>=startRow+1; i--) {
				if(startCol==endCol)
					break;
			System.out.print(mat[i][startCol]+" ");
		}
		
		startCol++;
		startRow++;
		endCol--;
		endRow--;
		
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
		spiral(mat);
	}

}
