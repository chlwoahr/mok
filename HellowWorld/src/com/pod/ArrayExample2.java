package com.pod;

public class ArrayExample2 {

	public static void main(String[] args) {
		int[] age = new int[3];
		age[0] = 20;
		age[1] = 20;
		age[2] = 20;
		
		age[0] = 30;
		age[1] = 32;
		age[2] = 35;
				
		int sumAge = 0;
		double avgAge = 0;
		for(int i =0;i<3;i++) {
			System.out.println(age[i]+"살 입니다.");
		}
		for(int i=0;i<3;i++) {
			sumAge += age[i];
		}
		avgAge = sumAge / (double) 3;
		System.out.println("합계:"+sumAge);
		System.out.printf("%.2f",avgAge);
		
	}
	

}
