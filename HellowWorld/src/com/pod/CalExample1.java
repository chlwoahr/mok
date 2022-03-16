package com.pod;

public class CalExample1 {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.PI);
		
		int number1 = 10;
		int number2 = 20;
		double r = 4.5;
		// 클래스에 정의된 기능을 호출 매개값
		int result = cal.add(number1, number2);
		System.out.println(number1+"과"+number2+"의"+"합계:"+result);
		
		result = cal.mius(number1, number2);
		System.out.println(result);
		//10 > 10.0
		double area =cal.getRectArea(number1, number2);
		System.out.println(number1+"과"+number2+"의 너비:"+area);
		
		r = cal.getCircleArea(r);
		 System.out.println("반지름r의 넓이는"+r+"입니다");
		
		

	}

}
