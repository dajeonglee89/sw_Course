package a.b;

import a.AccessEx;

public class SubAccessEx extends AccessEx {

	void subPrintField() {
		System.out.println("SubAccessEx - subPrintField");
		// System.out.println("a = " + a); //���������� private����� �޴µ� ������������
		// System.out.println("b = " + b); //���������� ����(package)
	    System.out.println("c = " + c); // protected ����
	    System.out.println("d = " + d); // public 
	
	
	}
	
	
	
	
}
