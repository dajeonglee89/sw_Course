package com.exam;


import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = (int)(Math.random()*3)+1; //1~3 중에 난수생성
		
		System.out.println("가위바위보 게임");
		System.out.println("가위바위보 중에 입력");
		String strCom = "";
		
		switch(a) {
		case 1: strCom = "가위";
		break;
		case 2: strCom = "바위";
		break;
		case 3: strCom = "보";
		break;
		} //생성된 난수에 가위, 바위, 보를 1대1 대응
		
		System.out.print("사용자 : ");
		String strUser = scan.next();
		System.out.println("컴퓨터 : " + strCom);

		if(strUser.equals("가위")) 
		{
		if(strCom.equals("가위")) 
			System.out.println("비겼습니다.");	
		else if(strCom.equals("바위")) 
			System.out.println("컴퓨터가 이겼습니다.");
		else if(strCom.equals("보")) 
			System.out.println("사용자가 이겼습니다.");
		}
		
		if(strUser.equals("바위")) 
		{
		if(strCom.equals("바위")) 
			System.out.println("비겼습니다.");	
		else if(strCom.equals("보")) 
			System.out.println("컴퓨터가 이겼습니다.");
		else if(strCom.equals("가위")) 
			System.out.println("사용자가 이겼습니다.");
		}
		
		if(strUser.equals("보")) 
		{
		if(strCom.equals("보")) 
			System.out.println("비겼습니다.");	
		else if(strCom.equals("가위")) 
			System.out.println("컴퓨터가 이겼습니다.");
		else if(strCom.equals("바위")) 
			System.out.println("사용자가 이겼습니다.");
		}
		
		
		
		
		/*
		System.out.print("철수 : ");
		String a = scan.next();
		System.out.print("영희 : ");
		String b = scan.next();
		if(a.equals("가위")) 
		{
		if(b.equals("가위")) 
			System.out.println("비겼습니다.");	
		else if(b.equals("바위")) 
			System.out.println("영희가 이겼습니다.");
		else if(b.equals("보")) 
			System.out.println("철수가 이겼습니다.");
		}
		
		if(a.equals("바위")) 
		{
		if(b.equals("바위")) 
			System.out.println("비겼습니다.");	
		else if(b.equals("보")) 
			System.out.println("영희가 이겼습니다.");
		else if(b.equals("가위")) 
			System.out.println("철수가 이겼습니다.");
		}
		
		if(a.equals("보")) 
		{
		if(b.equals("보")) 
			System.out.println("비겼습니다.");	
		else if(b.equals("가위")) 
			System.out.println("영희가 이겼습니다.");
		else if(b.equals("바위")) 
			System.out.println("철수가 이겼습니다.");
		}
	
	
	*/
	
	scan.close();
	}
	
	

}
