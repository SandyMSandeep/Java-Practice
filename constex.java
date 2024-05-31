package com.personal.demo;

class Studentconst{
	String name;
	int id;
	String place;
	char gender;
	int marks;
	
	public Studentconst(String n,int i,String p,char g,int m){
		name=n;
		id=i;
		place=p;
		gender=g;
		marks=m;
	}
}	

public class constex {

	public static void main(String[] args) {
		Studentconst s1 = new Studentconst("Sandy",14,"tpt",'M',96);
		Studentconst s2 = new Studentconst("Evaro",1,"ekado",'F',69);
		
		System.out.println(s1.name+" "+s1.id+" "+s1.place+" "+s1.gender+" "+s1.marks);
		System.out.println(s2.name+" "+s2.id+" "+s2.place+" "+s2.gender+" "+s2.marks);
	}
}
