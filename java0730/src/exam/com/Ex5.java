package exam.com;

class A extends Object{
	A() {
	 super();	
	 System.out.println("������A");	
	}
}

class B extends A{
	B() {
	 super();	
	 System.out.println("������B");	
	}
}


class C extends B{
	C() {
	 super();
	 System.out.println("������C");	
	}
	
	C(int num){
	 this();
	}
}


public class Ex5 {

	public static void main(String[] args) {
		C c = new C();

	}

}
