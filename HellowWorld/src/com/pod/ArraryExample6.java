package com.pod;

public class ArraryExample6 {

	public static void main(String[] args) {
		int[] numbers = {35,22,17,40,28,33,36};
		int sum = 0;
		int avg = 0;
		// 배열의 값이 30보다 크고 40보다 작은 값의 합, 평균..
		for(int i= 0;i<numbers.length;i++) {
			if(numbers[i]>30 && numbers[i]<40) {
				sum += numbers[i];
				avg++;
			}
		}
		System.out.println(sum);
		System.out.println((double)sum/avg);

	}

}
