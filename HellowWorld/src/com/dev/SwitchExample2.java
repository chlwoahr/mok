package com.dev;

public class SwitchExample2 {

	public static void main(String[] args) {
		// 90점 이상 a, 80 이상 b, 70이상 c, 60점 d, 그외f;
		int score =100;
//		if (score>=90) {
//			score = 1;
//		}
//		else if(score>=80) {
//			score = 2;
//		}
//		else if(score>=70) {
//			score = 3;
//		}
//		else if(score>=60) {
//			score = 4;
//		}
//		else score = 5;
		switch(score / 10) {
		case 10: 
		case 9: System.out.println("A");
		break;
		case 8: System.out.println("B");
		break;
		case 7: System.out.println("C");
		break;
		case 6: System.out.println("D");
		break;
		case 5: System.out.println("F");
		
		}
		
		
	}

}
