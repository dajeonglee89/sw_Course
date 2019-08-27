package a.b;

import a.AccessEx;

public class SubAccessEx extends AccessEx {

	void subPrintField() {
		System.out.println("SubAccessEx - subPrintField");
		// System.out.println("a = " + a); //접근지정자 private상속은 받는데 가려져있을분
		// System.out.println("b = " + b); //접근지정자 생략(package)
	    System.out.println("c = " + c); // protected 가능
	    System.out.println("d = " + d); // public 
	
	
	}
	
	
	
	
}
