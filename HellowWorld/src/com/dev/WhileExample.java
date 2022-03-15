package com.dev;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
//		int i=1;
//		while(i<=5) { //조건식 참일경우 거짓이될때까지 반복
//			System.out.println("i의 값>"+i);
//			i++; // 증감식
//			
//		}
//		int num =0;
//		
//		while(true) {
//			System.out.println(num);
//			num++;
//			if(num>5) {
//			break;
//		}
//
//	}
//		while(true) {
//			int rand = (int)(Math.random()*10)+1;
//			System.out.println("임의의 생성된 값:"+rand);
//			if(rand==8) {
//				break;
//			}
//		}
		// 수를 맞출때 까지 계속 반복..
		Scanner sc = new Scanner(System.in);
		int randVal, userVal;
		randVal = (int)(Math.random()*5)+1;
		while(true) {
			
			System.out.println("임의의값을 입력(1~5)");
			userVal = sc.nextInt();
			if(randVal==userVal) {
				System.out.println("정답");
				break;
			}
		}
}
}