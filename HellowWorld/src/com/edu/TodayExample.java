package com.edu;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

// 이름을 입력받도록...(String)
// 연락처 입력...(String)
// 나이 입력...(int)
// 키...(double)

// 이름은 :
// 연락처 :
// 나이 :
// 키 :
// 몸무게 :
// 적정몸무게:(키 - 100) * 0.9 크면 과체중 작으면 저체중
public class TodayExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n,p;
		int a;
		double k,m,jj;
		
		System.out.println("이름은...");
		n = sc.nextLine();
		System.out.println("연락처 입력...");
		p = sc.nextLine();
		System.out.println("나이 입력...");
		a = sc.nextInt();
		System.out.println("키 입력...");
		k = sc.nextDouble();
		System.out.println("몸무게...");
		m = sc.nextDouble();
		System.out.println("이름은:"+n);
		System.out.println("연락처:"+p);
		System.out.println("나이:"+a);
		System.out.println("키:"+k+"cm");
		System.out.println("몸무게:"+m);
		jj = ((k-100)*0.9) ;
				
		if(jj+5>m&&jj-5<m) {
			System.out.println("정상");
		}
		else {
			System.out.println("비정상");
			
		}
		}
	
		
		
		
	}


