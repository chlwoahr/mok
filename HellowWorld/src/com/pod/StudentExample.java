package com.pod;

public class StudentExample {

	public static void main(String[] args) {
		Studdent s1 = new Studdent();
		s1.stdutName = "홍길동";
		s1.kor = 80;
		s1.eng = 85;
		s1.study("수학");
		s1.eat("커피");
		s1.eat("간식");
		s1.eat("초코");
		int v1 = s1.getKorScore();
		int v2 = s1.getEnglish();
		System.out.println("국어점수"+v1+"영어점수"+v2);
		

	}

}
