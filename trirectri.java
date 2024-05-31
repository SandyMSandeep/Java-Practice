/* 
 * #
 * ##
 * ###
 * ####
 * ****
 * ****
 * ****
 * #
 * ##
 * ###
 * ####
 */

package com.pattern.all;

public class trirectri {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=3;j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		for(int k=1;k<=4;k++) {
			for(int j=1;j<=k;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=3;j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}

