package com.dev;

public class ForExample2 {

	public static void main(String[] args) {
//		for(int i=1;i<=3;i++) {
//			System.out.println(i);
//		}
//		for(int i=4;i<=6;i++) {
//			System.out.println(i);
//		}
//		for(int i=5;i>=1;i--) {
//			System.out.println(i);
//		}
//		for(int i=1;i<=10; i+=2) {
//			System.out.println(i);
//		}
		int sum =0;
		int s = 11;
		int l = 20;
		for(int i = s; i<=l; i++) {
			if(s%2==0) {
				
				System.out.println(s);
				sum += s;
			}
			System.out.println(sum);
			
		}

	}

}
