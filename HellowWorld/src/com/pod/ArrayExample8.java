package com.pod;

import java.util.Scanner;

public class ArrayExample8 {

	public static void main(String[] args) {
		// 입력한 두값중 작은값을 출력하도록
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[2];
		int temp = 0;
		
		System.out.println("첫번째 값을 입력");
		numbers[0] = sc.nextInt();
		System.out.println("두번째 값을 입력");
		numbers[1] = sc.nextInt();
		
		if(numbers[0]>numbers[1]) {
			temp = numbers[0];
			numbers[0] = numbers[1];
			numbers[1] = temp;
			
		} 
		System.out.println("첫번째값:" + numbers[0]);
		System.out.println("두번째값:" + numbers[1]);

		

	}

}
