package com.dev;

public class SwitchExample {
	public static void main(String[] args) {
		// 가위(1),바위(2),보(3)
		int ranVal = (int)(Math.random()*3)+1;
		
//		if(ranVal==1) {
//			System.out.println("가위입니다.");
//		} else if(ranVal==2) {
//			System.out.println("바위입니다.");
//		}
//		else {
//			System.out.println("보입니다.");
//		}
		
		switch(ranVal) {
		case 1: System.out.println("가위입니다");
		break;
		case 2: System.out.println("바위입니다");
		break;
		case 3: System.out.println("보입니다");
				
		}
		System.out.println("end of prog");
}
}
