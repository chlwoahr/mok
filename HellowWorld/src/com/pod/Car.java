package com.pod;

public class Car {
	// 자동차의 모델, 현재속도,최고속도,가속(현재속도+10),감속(현재속도-10),현재속도()
	
	private String model;
	private int speed;
	private int maxSpeed;
	
	public void addSpeed() {
		if(this.speed + 10 > this.maxSpeed) {
			System.out.println("최고속도를 초과할수없습니다.");
			return;
		}
		System.out.println("10km 가속합니다.");
		this.speed += 10;
	}
	public void breakSpeed() { // 0km보다 안떨어지도록 코드넣기
		if(this.speed - 10 > 0) {
			System.out.println("멈춰");
			return;
			
		}
		System.out.println("10km 감속합니다.");
		this.speed -= 10;
	}
	public int getSpeed() {
		return this.speed;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	

	
	
	
}
