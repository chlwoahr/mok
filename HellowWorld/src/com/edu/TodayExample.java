package com.edu;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

// �씠由꾩쓣 �엯�젰諛쏅룄濡�...(String)
// �뿰�씫泥� �엯�젰...(String)
// �굹�씠 �엯�젰...(int)
// �궎...(double)

// �씠由꾩� :
// �뿰�씫泥� :
// �굹�씠 :
// �궎 :
// 紐몃Т寃� :
// �쟻�젙紐몃Т寃�:(�궎 - 100) * 0.9 �겕硫� 怨쇱껜以� �옉�쑝硫� ��泥댁쨷
public class TodayExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n,p;
		int a;
		double k,m,jj;
		
		System.out.println("이름은...");
		n = sc.nextLine();
		System.out.println("번호는...");
		p = sc.nextLine();
		System.out.println("나이는...");
		a = sc.nextInt();
		System.out.println("�궎 �엯�젰...");
		k = sc.nextDouble();
		System.out.println("紐몃Т寃�...");
		m = sc.nextDouble();
		System.out.println("�씠由꾩�:"+n);
		System.out.println("�뿰�씫泥�:"+p);
		System.out.println("�굹�씠:"+a);
		System.out.println("�궎:"+k+"cm");
		System.out.println("紐몃Т寃�:"+m);
		jj = ((k-100)*0.9) ;
				
		if(jj+5>m&&jj-5<m) {
			System.out.println("�젙�긽");
		}
		else {
			System.out.println("鍮꾩젙�긽");
			
		}
		}
	
		
		
		
	}


