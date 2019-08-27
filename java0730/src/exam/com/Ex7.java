package exam.com;

class Animal{
	void speak() {
		System.out.println("�Ҹ�����~");
	}
}


class Dog extends Animal{

	@Override //�ֳ����̼�(annotation)
	void speak() {
	 System.out.println("�������� �Ŀ˳Ŀ�");
	}
	
	void beFriendly() {
		System.out.println("������ �ֱ�����");
	}
	
}

class Cat extends Animal{

	@Override
	void speak() {
		System.out.println("����̴� �۸�");
	}
	
}

class Duck extends Animal{

	@Override
	void speak() {
		System.out.println("��");
	}
	
}

class Vet { //���ǻ�
	void giveShot(Animal animal){ //�ֻ���� �޼ҵ�
		animal.speak(); //�ֻ� �¾Ƽ� �۸۸۸۸�Ȱȭ����ȣ�˿п�
	}
}

public class Ex7 {

	public static void main(String[] args) {
		//�������ε��� �Ͼ�� ���
		Cat cat = new Cat();
		cat.speak();
		
		System.out.println("===========");
		
		

		//���� ���ε�
		Animal animal = new Animal();
		animal.speak();
		
		//�������ε�(�ڽ�Ÿ�� ��ü�� �θ�Ÿ�� ���������� ��� ����Ҷ�)
		animal = new Dog(); //��ĳ����( �θ�Ÿ�� = �ڽ�Ÿ��)
		animal.speak();
		Dog dog = (Dog)animal; //�ٿ�ĳ���� ( �ڽ�Ÿ�� = (�ڽ�Ÿ������ȯ)�θ�Ÿ�� )
		dog.beFriendly();
		
		animal = new Cat();
		animal.speak();
		
		animal = new Duck();
		animal.speak();
		
		System.out.println("===============");
		
		Vet vet = new Vet();
		vet.giveShot(new Dog());
		vet.giveShot(new Cat());
		vet.giveShot(new Duck());

	}

}
