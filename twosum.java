/* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Input Format

First line of each test case or query contains an integer 'N' representing the size of the first array/list.
Second line contains 'N' single space separated integers representing the elements in the array/list.
Third line contains an integer 'X'.
Constraints

Time complexity Constraint : O(n)
Output Format

Two integer values indicating the indices of the two numbers whose sum is equal to the target value.
Sample Input 0

4
2 7 11 15
9
Sample Output 0

0 1
Sample Input 1

3
3 2 4
6
Sample Output 1

1 2 */

package com.personal.demo;
import java.io.*;
import java.util.*;

public class twosum {
	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	    Scanner sc=new Scanner(System.in);
	        int size=sc.nextInt();
	        int arr[]=new int[size];
	        for(int i=0;i<size;i++){
	            arr[i]=sc.nextInt();
	        }
	        int tot=sc.nextInt();
	        for(int i=0;i<=size;i++){
	            for(int j=i+1;j<size;j++){
	                int sum=arr[i]+arr[j];
	                if(sum==tot){
	                    System.out.print(i+" "+j);
	                    break;
	                }
	                
	            }
	        }
	    }
	}