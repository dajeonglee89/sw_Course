package exam.com;

class Parent {
	void printParent() {
		System.out.println("printParent()");
	}
}

class Child extends Parent { // ���
	void printChild() {
		System.out.println("printChild()");
	}
}

class Child2 extends Parent {
	void printChild2() {
		System.out.println("printChild2()");
	}
}

public class Ex6 {

	public static void main(String[] args) {
		// �⺻�ڷ��� ����ȯ
		//   -> ����������(ȣȯ����) ����ȯ ����!
		double d = 3; // int -> double 3.0 �ڵ�����ȯ
		System.out.println(d); // 3.0
		
		int a = (int) 3.14; // double -> int ��������ȯ
		System.out.println(a); // 3
		
		// ��������(���۷���) ����ȯ
		//   -> ��Ӱ��賢��(ȣȯ����) ����ȯ ����!
		
		Child c = new Child();
		c.printParent();
		c.printChild();
		
		System.out.println("==============");
		
		Parent p; // �θ�Ÿ�� ���������� ū Ÿ���̴�.
		p = new Child(); // �θ�Ÿ��(ŭ) = �ڽ�Ÿ��(����) 
		p.printParent();
//		p.printChild();
		
		System.out.println("==============");
		
		c = (Child) new Parent(); // �ڽ�Ÿ��(����) = �θ�Ÿ��(ŭ)
		c.printParent();
		c.printChild();
		
		System.out.println("==================");
		
		Child c2 = new Child();
		c2.printParent();
		c2.printChild();
		
		Parent p2 = c2; // �θ�Ÿ�� = �ڽ�Ÿ��
		// ��ĳ����: �ڵ�����ȯ -> ������
		p2.printParent();
//		p2.printChild(); // �θ����������δ� �ڽĸ�� ���ٸ���
		
		System.out.println("==================");
		
		// �θ�Ÿ�� = �ڽ�Ÿ��
		Parent p3 = new Child(); //��ĳ����
		p3.printParent();
		
		Child c3;
		c3 = (Child)p3;// �ڽ�Ÿ�� = �θ�Ÿ�� ->> �ٿ�ĳ����(����(�����)����ȯ)
		c3.printChild();
		
		
		
	} // main method

}
