package com.exam;

// Point2D Ŭ����
// �ʵ� ������ x y
// �޼ҵ� print2D -> ��� "x,y"

class  Point2D{
	int x;
	int y;
	
	void print2D() {
		System.out.println(x + " " + y);
	}
	
}

// Point3D Ŭ���� ��� Point2D
// �ʵ� ������ z
// �޼ҵ� print3D -> ��� "x,y,z"

class Point3D extends Point2D{
	int z;
	void print3D() {
		System.out.println(x + " " + y + " " +z);
	}
}



public class Ex2 {

	public static void main(String[] args) {
		// Point3D ��ü����
		Point3D a = new Point3D();
		// x=10 y=20 z=30
		a.x = 10;
		a.y = 20;
		a.z = 30;
		// �޼ҵ� ȣ�� print2D() print3D()

		a.print2D();
		a.print3D();
		

	}

}
