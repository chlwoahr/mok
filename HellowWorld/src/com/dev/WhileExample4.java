package com.dev;

import java.util.Scanner;

public class WhileExample4 {

	public static void main(String[] args) {
		// 은행 계좌를 만들어서 1:입금 2:출금, 3:종료
		// 입금일 경우: 입금액을 입력하세요... account 값을 누적
		// 출금일 경우: 출금액을 입력하세요... account 값을 차감
		// 종료일 경우: 프로그램 종료.
		int account = 0;
		int meau;
		

		Scanner sc = new Scanner(System.in);
		while(true) {
			
			System.out.println("1:입금, 2:출금, 3:종료");
			int menu = sc.nextInt();
			if(menu == 1) {
				System.out.println("금액을 정하세요");
				account += sc.nextInt();
				System.out.println("금액은"+account);
			}
			else if(menu == 2) {
				int a = account;
				System.out.println("출금액을 정하세요");
				a-= sc.nextInt();
				if(account<a) {
					System.out.println("잔액이없습니다");
					System.out.println("현재잔액:"+ account);
					continue;
				}
				else if(account>a) {
					System.out.println("금액은"+account);
				}
			}
			else if(menu == 3) {
				System.out.println("종료");
				break;
			}
		}
		System.out.println("end");
	}

}
