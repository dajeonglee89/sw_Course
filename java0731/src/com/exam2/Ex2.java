package com.exam2;

// �߻�Ŭ���� Shape2D
// �߻�޼ҵ� void draw()

abstract class Shape2D{
	Shape2D(){
		super();
	}
	abstract void draw();
}

// Ŭ���� Cir ��� Shape2D
// �޼ҵ� �������̵� -> ��� "���� �׸���."

class Cir extends Shape2D{

	@Override
	void draw() {
	  System.out.println("���� �׸���");
	 
	}	
}

//Ŭ���� Rec ��� Shape2D
//�޼ҵ� �������̵� -> ��� "�簢���� �׸���."

class Rec extends Shape2D{

	@Override
	void draw() {
		System.out.println("�簢���� �׸���");		
	}	
}

//Ŭ���� Tri ��� Shape2D
//�޼ҵ� �������̵� -> ��� "�ﰢ���� �׸���."

class Tri extends Shape2D{

	@Override
	void draw() {
		System.out.println("�ﰢ���� �׸���");
		
	}
	
}

public class Ex2 {

	public static void main(String[] args) {
		Shape2D s;
		
		s = new Cir();
		s.draw();
		
		s = new Rec();
		s.draw();
		
		s = new Tri();
		s.draw();

	}

}
