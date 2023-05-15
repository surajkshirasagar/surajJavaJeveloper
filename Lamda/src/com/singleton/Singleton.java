package com.singleton;

import java.util.Scanner;

public class Singleton {
public static void main(String[] args) {
	
	String str="nayan";
	
	String rev="";
	
	for(int i=str.length()-1;i>=0;--i) {
		
		rev=rev+str.charAt(i);
	}
	

	
	if(str.toLowerCase().equals(rev.toLowerCase())) {
	System.out.println("pallindrome");
}else{
	System.out.println("not");
}
}
}