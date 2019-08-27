package com.exam2;

// �߻�Ŭ������ �Ǵ� ���
// 1) Ŭ������ ��ü���� ���ϰ� ���鶧
// 2) Ŭ���� �ȿ� �߻�޼ҵ尡 1�� �̻� �����Ҷ�

abstract class Shape{ //�߻�Ŭ����
	double area;

	abstract double getArea(); //�߻�޼ҵ�
}


class Circle extends Shape{
	
	int radius = 5;

	@Override
	double getArea() {
		area = radius * radius * Math.PI;
		return 0;
	}
  	
	}		



class Rectangle extends Shape{
	int width = 10;
	int height = 10;

	@Override
	double getArea(){
		super.area = width * height;	
		return area;	
	}
}


//Ŭ���� Triangle �ﰢ�� // ��� Shape
//�ʵ� ������ width = 10, height = 10 // �غ�,���� (��x���� /2)
//�޼ҵ� �������̵� -> �ﰢ���� ���� ���ؼ� ����

class Triangle extends Shape{
	int width = 10;
	int height = 10;

	@Override
	double getArea(){
		super.area = width * height / 2.0;	
		return area;	
	}

}


public class Ex1 {

	public static void main(String[] args) {
		Shape s = new Circle();
		s = new Rectangle();
		s = new Triangle();
		
		System.out.println(s.getArea());

	} //main
}
