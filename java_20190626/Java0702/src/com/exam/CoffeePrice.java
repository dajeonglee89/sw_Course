package com.exam;


import java.util.Scanner;

public class CoffeePrice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("커피 메뉴 선택 : ");
		String order = scan.next();
		int price =0;
	
		switch(order) {
		case "에스프레소" :
		case "카푸치노" :
		case "카페라떼" :
			price = 3500;
		break;
		case "아메리카노":
			price = 2000;
		break;
		default:
			System.out.println("메뉴에 없습니다.");
		}
		if(price != 0)
			System.out.println("주문하신 음료는 " + price + "원 입니다.");
	
	
	
	
	
	
	
	
	
	
	
	scan.close();
	}

}
