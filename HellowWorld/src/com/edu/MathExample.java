package com.edu;

import java.util.Scanner;
import java.util.function.BiConsumer;

public class MathExample {
//4) MathExample Ŭ���� �����ؼ� 
//2���� ���� �Է¹޾Ƽ�
//i) �� ���� ���� ���
//ii)�� ���� ���� ���
//iii) �μ��� ���� ���
//iv) �μ��� ���� ���
//v) ���� �������� ����ϵ��� ��� ����
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ��");
		a = sc.nextInt();
		System.out.println("�ι�° ��");
		b = sc.nextInt();
		System.out.println("�� ���� ��:"+(a+b));
		System.out.println("�� ���� ��:"+(a-b));
		System.out.println("�� ���� ��:"+(a*b));
		System.out.println("�� ���� ��:"+(a/b));
		System.out.println("�� ���� ������:"+(a%b));
		
		
		

	}

}
