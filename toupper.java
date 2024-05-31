package com.string.progs;
import java.util.Scanner;
public class toupper {
	
	public static String first_upper(String str) {
		StringBuffer sb = new StringBuffer("");
		char ch=Character.toUpperCase(str.charAt(0));
		sb.append(ch);
		
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)==' ' && i<str.length()-1) {
				sb.append(' ');
				i++;
				sb.append(Character.toUpperCase(str.charAt(i)));
			}
			else
				sb.append(str.charAt(i));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	System.out.println(str.toUpperCase());
	System.out.print(first_upper(str));
	}

}
