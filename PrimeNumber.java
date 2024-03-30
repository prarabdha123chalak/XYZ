package com.number;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int n=2;
		
		boolean flag=false;
		
		for(int i=2;i<=n/2;i++) {
			
			if(n%i==0) {
				flag=true;
				break;
			}
		}
		
		if(flag) {
			System.out.println("Not prime");
		}else {
			System.out.println("Prime");
		}
		
	}

}
