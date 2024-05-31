/* ****#
 * ****##
 * ****###
 */

package com.pattern.all;

public class rectri {
	public static void main(String[] args) {
	//Outer loop for rows
		for(int i=1;i<=3;i++) { 
			// for rectangle
			for(int j=1;j<=4;j++) {
				System.out.print("*");
			}
			//for triangle
			for(int k=1;k<=i;k++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
