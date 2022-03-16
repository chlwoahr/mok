package com.pod;

public class MemberExample {

	public static void main(String[] args) {
		Member mm = new Member(); // name,age속성 x
//		mm.name = "홍길";
//		mm.a = 20;
		Member mm2 = new Member();
		mm2.name = "민수";
		mm2.a = 21;
		Studdent stu = new Studdent();
		stu.stdutNo = "23-223";
		stu.stdutName = "목";
		stu.eng = 30;
		stu.kor = 50;
		
		Studdent stu1 = new Studdent();
		
		
		System.out.println("mm의 name속성:"+mm.name);
		System.out.println("mm의 a속성:"+mm.a);
		
		

	}

}
