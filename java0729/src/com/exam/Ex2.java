package com.exam;

// Point2D 클래스
// 필드 정수형 x y
// 메소드 print2D -> 출력 "x,y"

class  Point2D{
	int x;
	int y;
	
	void print2D() {
		System.out.println(x + " " + y);
	}
	
}

// Point3D 클래스 상속 Point2D
// 필드 정수형 z
// 메소드 print3D -> 출력 "x,y,z"

class Point3D extends Point2D{
	int z;
	void print3D() {
		System.out.println(x + " " + y + " " +z);
	}
}



public class Ex2 {

	public static void main(String[] args) {
		// Point3D 객체생성
		Point3D a = new Point3D();
		// x=10 y=20 z=30
		a.x = 10;
		a.y = 20;
		a.z = 30;
		// 메소드 호출 print2D() print3D()

		a.print2D();
		a.print3D();
		

	}

}
