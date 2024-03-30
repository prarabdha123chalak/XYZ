package com.number;

public class LargestOfThreeUsingTurnery {

//	11 55 44
	
	public static void main(String[] args) {
		int a=11,b=55,c=44;
		
//		condition ? ifTrue : false;
		
//		int largest=a>b ? a:b;
//		largest=largest>c?largest:c;
		
		int largest= (a>b ? a:b)>c ? (a>b ? a:b):c;
		
		System.out.println(largest);
	}
}
