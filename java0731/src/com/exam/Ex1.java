package com.exam;

//Ŭ���� Shape����  ->> �θ�Ŭ����
//�ʵ� double area ->> ������ ����
//�޼ҵ� getArea() -> area�� ���ؼ� ����

class Shape{
	double area;

	double getArea(){
		return area;

	}
}
// Ŭ���� Circle �� // ��� Shape
// �ʵ� ������ radius = 5 // ������
// �޼ҵ� �������̵� -> ���� ���� ���ؼ� ����

class Circle extends Shape{
	int radius = 5; 

	@Override
	double getArea() {		
		super.area = radius*radius * Math.PI;
		return area;	
		//	return area = radius*radius * Math.PI;	���ٷ� ����

	}		
}

//Ŭ���� Rectangle �簢�� // ��� Shape
//�ʵ� ������ width = 10, height = 10 // ����, ����
//�޼ҵ� �������̵� -> �簢���� ���� ���ؼ� ����

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
		// �������ε� (������ �������� �߻�)
		Circle c = new Circle();
		System.out.println("���Ǹ��� = " + c.getArea());

		Rectangle r = new Rectangle();
		System.out.println("�簢���Ǹ��� = " + r.getArea());

		Triangle t = new Triangle();
		System.out.println("�ﰢ���Ǹ��� = " + t.getArea());

		System.out.println("==============");

		//���� ���ε�(����ð��� JVM�� ���ؼ� �߻�.)
		// -> ��ü�� �������̵�(������)�� �޼ҵ尡 �ִ��� �˻���.
		Shape s;
		s = new Circle(); // ��ĳ����
		System.out.println("����: " + s.getArea());

		s = new Rectangle(); // ��ĳ����
		System.out.println("����: " + s.getArea());

		s = new Triangle(); // ��ĳ����
		System.out.println("����: " + s.getArea());

		System.out.println("==============");

		Shape[] shapeArr = new Shape[3];
		shapeArr[0] = new Circle();
		shapeArr[1] = new Rectangle();
		shapeArr[2] = new Triangle();


		for( Shape shape : shapeArr) {
			System.out.println("���� : " + shape.getArea());
		}

		System.out.println("==============");

		//printShapeArea(new Circle());

		Ex1 ex1 = new Ex1();
		ex1.printShapeArea(new Circle());

	} //main

	public void printShapeArea(Shape shape) {

		if (shape instanceof Circle) { // ��üŸ��Ȯ��
			Circle c = (Circle) shape; // �ٿ�ĳ����
			c.radius = 20;

			System.out.print("Circle ���� : ");
		} else if (shape instanceof Rectangle) {
			System.out.print("Rectangle ���� : ");
		} else if (shape instanceof Triangle) {
			System.out.print("Triangle ���� : ");
		} else if (shape instanceof Shape) {
			System.out.print("Shape��ü ����:");
		}

		System.out.println(shape.getArea());
	}

}
