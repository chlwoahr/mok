package com.pod;

public class ArrayExample3 {

	public static void main(String[] args) {
		String[] names = new String[5];
		names[0] = "홍길동";
		names[1] = "234";
		names[2] = "최재목";
		names[3] = "이창호";
		names[4] = "이름이름";
		
		names[1] = "이삼사";
		names[0] = null;
		
		String serchName = "이창호";
		for(int i =0 ; i<5;i++) {
			if(names[i] != null && names[i].equals(serchName)) {
				System.out.println(i+1+"번째 위치에있습니다.");
			}
			
//			if(names[i]!=null) {
//				System.out.println("이름: "+names[i]);	
//			}
			
		}
		

	}

}
