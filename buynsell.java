/*You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Input Format

First line of each test case or query contains an integer 'N' representing the size of the first array/list.
Second line contains 'N' single space separated integers representing the elements in the array/list.

Output Format

Integer representing the answer of the problem statement.
Sample Input 

6
7 1 5 3 6 4
Sample Output 

5
Explanation 

Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

*/
package com.personal.demo;

import java.util.Scanner;

public class buynsell {
	
	static int maxpro(int arr[],int n) {
		int maxprofit=0,minbuy=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			minbuy=Math.min(arr[i], minbuy);
			maxprofit=Math.max(maxprofit,arr[i]-minbuy);
		}
		
		return maxprofit;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(maxpro(arr,n));
	}

}
