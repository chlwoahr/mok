package com.dev;

import java.util.Scanner;

public class ForExample3 {

	public static void main(String[] args) {
		// 입력받는 두수를 num1, num2
		int num1,num2,sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수를 입력하시오");
		num1 = sc.nextInt();
		System.out.println("두번째 수를 입력하시오");
		num2 = sc.nextInt();
		if(num1>num2) {
			for(int i=num2;i<=num1;i++) {
				
				sum += i;
			}
			System.out.println(num2+"부터"+num1+"까지의 합:"+sum);
		}
			else {
			for(int i=num1;i<=num2;i++) {
				
				sum += i;
			}	
		}
		
				
		
		

		}
}
	


