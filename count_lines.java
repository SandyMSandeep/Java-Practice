package com.personal.demo;
import java.util.*;
public class count_lines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner(System.in);
		   int count =1;
		    for (int i=1;sc.hasNextLine();i++){
		        System.out.println(count+" "+sc.nextLine());
		        count++;
		    }

	}

}

