package com.string.progs;
import java.util.Arrays;
import java.util.Scanner;
public class anagram {
	
	static boolean Check(String s1,String s2) {
		if(s1.length()==s2.length()) {
			char[] c1=s1.toCharArray();
			char[] c2=s1.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			for(int i=0;i<c1.length;i++) {
				if(c1[i]!=c2[i])
					return false;
			}
		} 
		return true;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		System.out.println(Check(s1,s2));
		sc.close();
	}

}
