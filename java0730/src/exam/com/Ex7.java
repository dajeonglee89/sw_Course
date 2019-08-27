package exam.com;

class Animal{
	void speak() {
		System.out.println("소리내기~");
	}
}


class Dog extends Animal{

	@Override //애노테이션(annotation)
	void speak() {
	 System.out.println("강아지는 냐옹냐옹");
	}
	
	void beFriendly() {
		System.out.println("샤보는 애교쟁이");
	}
	
}

class Cat extends Animal{

	@Override
	void speak() {
		System.out.println("고양이는 멍멍");
	}
	
}

class Duck extends Animal{

	@Override
	void speak() {
		System.out.println("꽥");
	}
	
}

class Vet { //수의사
	void giveShot(Animal animal){ //주사놓기 메소드
		animal.speak(); //주사 맞아서 멍멍멍멍멍활화로할호알왈왈
	}
}

public class Ex7 {

	public static void main(String[] args) {
		//정적바인딩이 일어나는 경우
		Cat cat = new Cat();
		cat.speak();
		
		System.out.println("===========");
		
		

		//정적 바인딩
		Animal animal = new Animal();
		animal.speak();
		
		//동적바인딩(자식타입 객체를 부모타입 참조변수로 잡고 사용할때)
		animal = new Dog(); //업캐스팅( 부모타입 = 자식타입)
		animal.speak();
		Dog dog = (Dog)animal; //다운캐스팅 ( 자식타입 = (자식타입형변환)부모타입 )
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
