package com.pod;

public class ArrayeExample5 {

	public static void main(String[] args) {
		int[] numbers = {35,22,17,40,28,33,36};
		int sum =0;
		int avg =0;
		//홀수위치의 값 더하기
		for(int i=0;i<numbers.length;i++) {
			if(i%2==0) {
				sum += numbers[i];
				avg++;
			}
		}
		
		System.out.println("홀수의합"+sum);
		System.out.println("홀수의 평균값"+sum/avg);
	}

}
