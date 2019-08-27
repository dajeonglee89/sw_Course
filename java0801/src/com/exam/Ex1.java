package com.exam;

abstract class Animal{
	abstract void speak();
	
	void sleep() {
		System.out.println("���ڱ� ����");

	}
}

class Dog extends Animal implements DetectionAgent{
	@Override
	void speak() {
		System.out.println("�۸�~!!");
	}

	@Override
	public void detect() {
		System.out.println("ůů �������� Ž���ϴ�");	
	}	
	
	void beFriendly() {
		System.out.println("ģ���ϰ� ");
	}
}

interface DetectionAgent { //Ž�����
	/*public abstract*/ void detect();
}

class Person implements DetectionAgent{
	@Override
	public void detect() {
		System.out.println("���");	
	}	
	
}

public class Ex1 {

	public static void main(String[] args) {
		Animal animal = new Dog();
		animal.speak();
		
		Dog dog = (Dog) animal; //�ٿ�ĳ����
		dog.beFriendly();
		
		DetectionAgent agent = dog; //��ĳ����
		agent.detect();
		
		agent = new Person();
		agent.detect();

	}

}
