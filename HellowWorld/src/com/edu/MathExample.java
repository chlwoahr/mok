package com.edu;

import java.util.Scanner;

import java.util.function.BiConsumer;

public class MathExample {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자");
		a = sc.nextInt();
		System.out.println("두번째 숫자");
		b = sc.nextInt();
		System.out.println("합"+(a+b));
		System.out.println("차:"+(a-b));
		System.out.println("곱:"+(a*b));
		System.out.println("몫:"+(a/b));
		System.out.println("나머지:"+(a%b));
		
		
		

	}

}
