package com.exam;

// ��ӿ��� final Ű����

/*final*/ class Parent { // Ŭ���� ��� ���ϰ� ������
	
	
    //�ʵ带 ���ȭ�Ҷ��� �ַ� static final�� ����� ''	
	static final int PUPPY = 1; //���
	static final int CAT = 2; // ��� 
	
	/*final*/ int a = 10; // �ʵ尪 ������ϰ���.���ȭ.
	
	 void print() { //�޼ҵ� �������̵� ���ϰ� ����.
		System.out.println("Parent - print()");
	}
}

class Child extends Parent{

	@Override
	/*fianl*/ void print() {
	   System.out.println("Parent - print()");
	}
	
}




public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
