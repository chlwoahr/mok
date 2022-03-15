package com.dev;

import java.util.Scanner;

public class ForExample4 {

	public static void main(String[] args) {
		// 1~10 까지 수중에서 짝수의 값> evenSum, 홀수 > oddSum
		// 출력값 : 홀수의합, 짝수의 합
		int evenSum = 0, oddSum=0;
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				evenSum += i;
				
			}
			
		
			else  {
				oddSum += i;
				
			}
						
			
		}
		System.out.println("짝수의 합은"+evenSum);	
		System.out.println("홀수의 합은"+oddSum);
		int i = 48;
		int sum = 0;
		for(int j = 1;j<=i;j++) {
			if(i%j==0) {
				System.out.println(i+"의 약수는"+j);
				sum += j;
			}
			
		}
		System.out.println("약수의합은"+sum);
		
		}
	}
	

