package com.dev;

import java.util.Scanner;

public class ForExample5 {

	public static void main(String[] args) {
		int num1,num2,a = 0;
		Scanner sc = new Scanner(System.in);
		
		
			System.out.println("첫번째 수");
			num1 = sc.nextInt();
			System.out.println("두번째 수");
			num2 = sc.nextInt();
			
			if(num1>=num2) {
				num1 -= num2;
				System.out.println(num1);
			}
			else if (num1<=num2) {
				num2 -= num1;
				System.out.println(num2);
			}
			
			
			
			
		
		
	}

}
