package com.pod;

public class ArrayExample {

	public static void main(String[] args) {
//		long l1 = 9878900l; // long 표현시 l
//		int i1 = 100; // 4byte 20억표현
//		byte b1 = 100; // -128~127
//		short s1 = 100; //-32768~32767
//		int sum=0;
//		int score1 = 80;
//		int score2 = 80;
//		int score3 = 80;
//		int score4 = 80;
//		int score5 = 80;
//		
//		sum +=score1;
//		sum +=score2;
//		sum +=score3;
//		sum +=score4;
//		sum +=score5;
//
//		double avg = sum /(double)5;
		int[] scores = new int[5];
		scores[0] = 80;
		scores[1] = 70;
		scores[2] = 50;
		scores[3] = 90;
		scores[4] = 100;
		
//		System.out.println(scores[0]);
//		System.out.println(scores[1]);
//		System.out.println(scores[2]);
//		System.out.println(scores[3]);
//		System.out.println(scores[4]);
		int sum=0;
		System.out.println(scores[1]+scores[0]);
		for(int i =0 ; i<5 ; i++) {
			System.out.println(scores[i]);
			sum += scores[i];
		}
		double avg = sum /(double) 5;
		System.out.println(avg);
	}

}
