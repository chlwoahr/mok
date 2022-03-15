package com.edu;

import java.util.Scanner;

public class mokbo {

	public static void main(String[] args) {
		int a ;
		Scanner sc = new Scanner(System.in);
		System.out.println("티어를 입력하세요");
		a = sc.nextInt();	
		
		
		if (a==1) {
			System.out.println("병신");
		}
			else if(a==2) {
				System.out.println("벼어어엉신");
			}
				else if(a==3) {
					System.out.println("상병신");
				}
		
	}
	
}
	


