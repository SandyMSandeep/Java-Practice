package com.string.progs;
import java.util.Scanner;
public class shortest_path_nwes {
	
	public static float getpath(String str) {
		int x=0,y=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='N')
				y++;
			if(ch=='S')
				y--;
			if(ch=='E')
				x++;
			if(ch=='W')
				x--;
		}
		return (float)Math.sqrt((x*x)+(y*y));
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	System.out.print(getpath(str));
	}

}
