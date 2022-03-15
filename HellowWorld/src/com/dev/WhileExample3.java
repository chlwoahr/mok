package com.dev;

import java.util.Scanner;

public class WhileExample3 {

	public static void main(String[] args) {
		// 입력을 계속 입력할 수 ....
		// -1 값을 입력하면 입력멈춤..
		// sum 값에 입력...
		int sum=0;
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			int inputVal;
			System.out.println("숫자를 입력하세요");
			inputVal = sc.nextInt();

			sum += inputVal;
			if(inputVal==-1) {
				break;
			}
			

			
			
			
			
		}
		System.out.println("합계는:"+sum);
	}

}
