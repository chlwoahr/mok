package com.dev;

import java.util.Scanner;

public class IfExample3 {

	public static void main(String[] args) {
	int ranVal= (int)(Math.random()*3)+1; //0~10
	int a; 
	String b;
				
	Scanner sc = new Scanner(System.in);
	System.out.println("숫자를 입력하세요");
	a = sc.nextInt();
//	if(a==ranVal) {
//		System.out.println("정답");
//	}
//	else {
//		System.out.println("오류");
//	}
	
	System.out.println((a==ranVal) ? "정답":"오류");
	
	
	}

}
