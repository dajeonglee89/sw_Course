package com.exam;


//�������̽��� ��� ���� �����ڴ� public
interface IHello{//�������̽� ����(������ ���)
	// static final ���
	public static final int RED = 1;
	int BLUE = 2;
	
	// �޼ҵ�� �߻�޼ҵ常 ��������
	void sayHello();
	public abstract void sayGoodbye();
} 

class MyHello implements IHello {

	@Override
	public void sayHello() {
		System.out.println("�ȳ�");
		
	}

	@Override
	public void sayGoodbye() {
		System.out.println("�߰�");
		
	}
	
}

public class Ex3 {

	public static void main(String[] args) {
		System.out.println(IHello.RED);
		System.out.println(IHello.BLUE);
//		IHello.RED = 10;
//		IHello.BLUE = 20;
//		
//		//�������̽��δ� ��ü���� ����
//		IHello hello = new IHello();
		
		
		
	// �������̽� Ÿ�� ����������
	// �������̽��� ������ ��ü�� �����.
	IHello iHello = new MyHello(); //��ĳ����
	iHello.sayHello();
	iHello.sayGoodbye();
		
	}

}
