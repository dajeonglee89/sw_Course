package com.exam;

// *��ü���� ���� ���� 2���� : ��Ӱ���, ���԰���

// ���(Inheritance) : A��ü 1���� ��� 
// A�� B�� (A is a B) ������ �� ��Ӱ��� ����
// ���л��� �л��̴�.(O) <-> �л��� ���л��̴�.(X)
// �������� �����̴�.(O) <-> ������ ��������.(X)
// ���̽�ī�� �ڵ�����.(O) 
class RacingCar extends Car{
	
}


// ����(Include) : A��ü B��ü ���� ������ ���԰���� ���
// A�� B�� ������ (A has a B) �����϶� ���԰��� ����
// �ڵ����� ������ ������.
class Engine {}

class Car{
	Engine engine = new Engine();
}




//Ŭ�������� ���
class Parent{
	void printParent() {
		System.out.println("Parent Ŭ������ printParent()�޼ҵ�");
	}
	
}

class Child extends Parent{
	 void printChild() {
		 System.out.println("Child Ŭ������ printChild()�޼ҵ�");
	 }

}


class GrandChild extends Child{
	void printGrandChild() {
		 System.out.println("GrandChild Ŭ������ printGrandChhild()�޼ҵ�");
	 }

}



public class Ex1 {

	public static void main(String[] args) {
		
		//����GrandChild Ŭ���������� ����,�ڽ�,�θ�޼ҵ� ��� ȣ��
		GrandChild g = new GrandChild();
		g.printGrandChild();
		g.printChild();
		g.printParent();
		System.out.println("=========================");
		
		
		// �ڽ�Ŭ�������� �θ�޼ҵ� ȣ��
		Child c = new Child();
		c.printParent();
		c.printChild();
		System.out.println("=========================");
		
			
		// Ŭ�������� ���
		Parent p = new Parent();
		p.printParent();
		
	}//main method

}
