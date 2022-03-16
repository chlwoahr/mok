package com.dev;

import java.util.Scanner;

public class Work2 {

	public static void main(String[] args) {
		int num1,num2,num3;
		String a = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째");
		num1 = sc.nextInt();
		System.out.println("두번째");
		num2 = sc.nextInt();
		System.out.println("세번째");
		num3 = sc.nextInt();
		
//		if (num1<num2) {
//			if(num1<num3) {
//				if(num2<num3) {
//					a = num1+","+num2+","+num3;
//				}
//				else if(num2>num3) {
//					a = num1+","+num3+","+num2; 
//				}
//			}
//		}
//		if (num2<num1) {
//			if(num2<num3) {
//				if(num1<num3) {
//					a = num2+","+num1+","+num3;
//				}
//				else if(num1>num3) {
//					a = num2+","+num3+","+num1;
//				}
//			}
//		}
//		if (num3<num1) {
//			if(num3<num2) {
//				if(num1<num2) {
//					a = num3+","+num1+","+num2;
//				}
//				else {
//					a = num3+","+num2+","+num1;
//				}
//			}
//		}
		
		if(num1<num2 && num1>num3 && num2<num3) {
					a = num1+" "+num2+" "+num3;
				}
		else if(num1<num2 && num1<num3 && num2>num3)  {
					a = num3+" "+num2+" "+num1;
			
		}
		else if(num2<num1 && num2<num3 && num1<num3) {
			a = num2+" "+num1+" "+num3;

		}
		else if(num2<num1 && num2<num3 && num1>num3) {
			a = num2+" "+num3+" "+num1;
		}
		else if(num3<num1 && num3<num2 && num1<num2) {
			a = num3+" "+num1+" "+num2;
		}
		else {
			a = num3+" "+num2+" "+num1;
		}
			System.out.println(a);
	}
}
				


