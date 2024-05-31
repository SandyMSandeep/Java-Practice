package com.personal.demo;
import java.util.Scanner;

public class numrat {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int row=0;row<n;row++) {
            for(int space=1;space<n-row;space++)
            {
                System.out.print("  ");
            }
            int num=1;
            for(int j=0;j<=row;j++) {
                System.out.print(num+" ");
                num*=2;
            }
            System.out.println();
        }
        sc.close();
    }

}
