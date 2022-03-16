package com.pod;

public class ReFerenceExample {
	public static void main(String[] args) {
		//참조 타입 vs 기본타입
		
		int num1 = 10; // 리트럴
		
		System.out.println(num1);
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1.equals(str2));// 참조변수 내용 비교 ex.equals(ex1)
}
	
}
