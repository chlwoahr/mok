package com.dev;

public class IfExample {

	public static void main(String[] args) { // 클래스이름 대문자시작
		// 조건문 if(조건)
		// 60점 이상이면 pass
		int score = 83;
		if (score > 60) {
			System.out.println("Pass입니다");
		} else {
			System.out.println("Fail입니다");
		}
		if (score >= 90) {
			if (score >= 95) {
				System.out.println("A+ 입니다.");
			} else {
				System.out.println("A 입니다");

			}
		} else if (score >= 80) {
			if (score >= 85) {
				System.out.println("B+ 입니다");
			} else {
				System.out.println("B 입니다.");
			}

		} else if (score >= 70) {
			if (score >= 75) {
				System.out.println("C+ 입니다");
			} else {
				System.out.println("C 입니다");
			}

		} else if (score >= 60) {
			if (score >= 65) {
				System.out.println("D+ 입니다");
			}
			System.out.println("D 입니다");
		} else {
			System.out.println("F 입니다");
		}

		System.out.println("end of Program");
	}

}
