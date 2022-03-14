package com.edu;

import java.util.Scanner;

public class CashExample {

	public static void main(String[] args) {
		// 2개의 값을 입력.
		int price, cash;
		
		// 가격을 입력하세요...
		Scanner snc = new Scanner(System.in);
		System.out.println("가격을 입력하세요");
		price = snc.nextInt(); // 5500원은 부가세 10%가 포함된 금액
		// 손님이 낸 금액
		System.out.println("손님이 낸 금액");
		cash = snc.nextInt(); //10000원		
//		System.out.println("손님이 낸 금액은"+cash+"입니다");
		System.out.println("거스름돈은"+(cash-price)+"입니다");
		System.out.println("부가세는"+(price*1/11)+"입니다");
		
		//하나는 상품의 부가세, 하나는 거스름돈
		//부가세 : 500원
		//거스름돈 : 

	}

}
