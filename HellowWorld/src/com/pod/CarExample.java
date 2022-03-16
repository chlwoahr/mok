package com.pod;

public class CarExample {

	public static void main(String[] args) {
		Car sonata = new Car();
		sonata.setModel("Sonata DN8");
		sonata.setSpeed(20);
		sonata.setMaxSpeed(180);
		
		sonata.breakSpeed();
		sonata.breakSpeed();
		sonata.breakSpeed();
		sonata.breakSpeed();
		
		System.out.println("현재속도"+sonata.getSpeed());
//		sonata.addSpeed();
//		sonata.addSpeed();
//		sonata.addSpeed();
//		
//		System.out.println("현재속도"+sonata.getSpeed());
//		sonata.addSpeed();
//		sonata.addSpeed();
//		sonata.addSpeed();
//		System.out.println("현재속도"+sonata.getSpeed());
//		sonata.breakSpeed();
//		System.out.println("현재속도"+sonata.getSpeed());

	}

}
