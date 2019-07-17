package com.exam;

public class Rectangle {

		int x;
		int y;
		int width;
		int height;
		
		Rectangle(int _x, int _y, int _width, int _height){
			x = _x;
			y = _y;
			width = _width;
			height = _height;
		}
		
		
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		public int getWidth() {
			return width;
		}
		public void setWidth(int width) {
			this.width = width;
		}
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}

		int square() {
			return width * height;
		}
		
		void show() {
			System.out.println("좌표 : " + x + y + width + height);
			System.out.println("넓이 : " + square());
		}


		
		
	}