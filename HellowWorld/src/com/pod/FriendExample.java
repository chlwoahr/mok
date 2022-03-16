package com.pod;

import java.security.spec.ECFieldF2m;

public class FriendExample {

	public static void main(String[] args) {
		Friend f1 = new Friend();
		f1.name = "권가희";
		f1.phone = "010-2546-1234";
		f1.email = "rnjsrkgml@naver.com";
		f1.k = 160.5;
		f1.m = 80.5;
		
		Friend f2 = new Friend();
		f2.name = "이유빈";
		f2.phone = "010-1234-5678";
		f2.email = "dldbqls@naver.com";
		f2.k = 150.5;
		f2.m = 70.1;
		
		Friend f3 = new Friend();
		f3.name = "나현주";
		f3.phone = "010-1234-5678";
		f3.email = "skguswn@naver.com";
		f3.k = 170.5;
		f3.m = 60.2;
		
//		System.out.println(f1);
		
		Friend[] friends = {f1,f2,f3};
		
		for(int i=0 ; i < friends.length; i++) {
			if(friends[i].k<170) {
				System.out.println("이름:" + friends[i].name);
				System.out.println("전화번호:" + friends[i].phone);
				System.out.println("키:" + friends[i].k);
				System.out.println("===============");	
			}
			
		}
		
		
	

	}

}

