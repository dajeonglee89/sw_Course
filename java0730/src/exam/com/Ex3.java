package exam.com;

// �޼ҵ� �������̵�(Overriding) : �θ��� �޼ҵ� ������

class Wolf{
	void speak() {
		System.out.println("�ƿ�~");
	}
}

class Puppy extends Wolf {
	// �޼ҵ� �������̵�(������)
	void speak() {
		
		System.out.println("�۸�");
	}
	
	void sound() {
		// speak(); // this.speak();
		super.speak();
	}
}


public class Ex3 {

	public static void main(String[] args) {
		Puppy puppy = new Puppy();
		puppy.sound();

	}

}
