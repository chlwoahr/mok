package com.edu;

import java.util.Scanner;
import java.util.function.BiConsumer;

public class MathExample {
//4) MathExample 클래스 생성해서 
//2개의 수를 입력받아서
//i) 두 수의 합을 출력
//ii)두 수의 차를 출력
//iii) 두수의 곱을 출력
//iv) 두수의 몫을 출력
//v) 나눈 나머지를 출력하도록 기능 구현
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수");
		a = sc.nextInt();
		System.out.println("두번째 수");
		b = sc.nextInt();
		System.out.println("두 수의 합:"+(a+b));
		System.out.println("두 수의 차:"+(a-b));
		System.out.println("두 수의 곱:"+(a*b));
		System.out.println("두 수의 몫:"+(a/b));
		System.out.println("두 수의 나머지:"+(a%b));
		
		
		

	}

}
