package com.string.progs;
import java.util.Scanner;
public class vowel_count {
	
	static int counting(String str) {
		int vowcount=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				vowcount++;
			}
		}
		return vowcount;
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	System.out.println(counting(str));
	}

}
