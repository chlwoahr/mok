package com.pod;

public class Studdent {
	// 필드
	String stdutNo;
	String stdutName;
	int kor;
	int eng;
	
	// 기능 method
	void study(String subject){
		System.out.println(subject+"을(를)공부 합니다.");
	}
	void eat(String food) {
		System.out.println(food+"을 먹습니다");
	}
	int getKorScore() {
		return kor;
}
	int getEnglish() {
		return eng;
	}
}
