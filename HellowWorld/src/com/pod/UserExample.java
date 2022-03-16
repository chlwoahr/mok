package com.pod;

public class UserExample {

	public static void main(String[] args) {
//		userid - 유저아이디
//		userlv - 유저등급
//		usernu - 유저전화번호
//		userpo - 포인트
		User u = new User();
		
		u.setUserid("얼굴");
		u.setUserlv("B");
		u.setUsernu("010-1234-5678");
		u.setUserpo(500);

		User u1 = new User();
		
		u1.setUserid("면상");
		u1.setUserlv("A");
		u1.setUsernu("010-7894-1234");
		u1.setUserpo(1000);

		User u2 = new User();
		
		u2.setUserid("와꾸");
		u2.setUserlv("C");
		u2.setUsernu("010-1234-5678");
		u2.setUserpo(2000);

		User u3 = new User();
		
		u3.setUserid("갈통");
		u3.setUserlv("A");
		u3.setUsernu("010-1234-5678");
		u3.setUserpo(3000);

		User[] users = {u,u1,u2,u3};
		 for(int i=0; i<users.length; i++) {
			 if(users[i].getUserpo()>=1000 && users[i].getUserlv()=="A") {
				 System.out.println(users[i].getUserInFo()); 
			 }
			 
		 }
			 
		 
		
	}

}
