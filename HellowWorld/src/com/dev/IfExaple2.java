package com.dev;

import java.util.Scanner;

public class IfExaple2 {

	public static void main(String[] args) {
		// 물건가격이 5만원이상이면 배송비 0원,
		// 그외 배송비 3천원
		//결제할 금액이 얼마인지를 보여주는 코드
		// 결제할 금액 출력
		int a,b = 3000;
		Scanner sc = new Scanner(System.in);
		System.out.println("상품금액");
		a = sc.nextInt();
		
		a = (a>=50000) ? a : a+b;
		
		System.out.println("결제할 금액은" + a + "입니다");
			
		}
//		if(a>=50000){
//			System.out.println("결제할 금액은"+a+"입니다");
//		}
//		System.out.println("결제할 금액은"+(a+3000)+"입니다");
////			else {
//				System.out.println("결제할 금액은"+(a+3000)+"입니다");
//			}
		}
		
		
		
		


