package com.number;

public class PrimeNumberFirstFifty {
	
	public static void main(String[] args) {
		
		
		int count=0;
		
		for(int n=2;count<50;n++) {
			boolean flag=true;
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					flag=false;
					break;
				}	
			}
			
			if(flag) {
				System.out.print(n+" ,");
				count++;
			}
			
		}
		
	}

}
