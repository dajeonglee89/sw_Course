package exam.com;


// super. this. <- 객체의 접근가능영역 기준으로 구분
// super. 은 부모멤버와 자식멤버 이름이 같은경우 서로 구별을 위해 사용함. 

class Employee{ //사원클래스
	private String name; //이름
	private int salary; //급여
	
	Employee() {}
	
	
	Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}



	String getEmployee(){
		return name + ", " + salary;
	}
} // class Employee



class Manager extends Employee{
	String depart; //부서명
//	String name; // 필드 오버라이딩
	
	
	// 생성자 name salary depart 받는 생성자
	Manager(String name, int salary, String depart) {
		super(name, salary);
//		super.name = name;
//		super.salary = salary;
		this.depart = depart;
	}

	
	
	
	String getManager() {
		// return name + ", " + salary + ", " + depart;
		return super.getEmployee() + ", " + depart;
	}

}




public class Ex2 {

	public static void main(String[] args) {
		Employee emp = new Employee("이다정" , 100000);
		System.out.println(emp.getEmployee());
		
		Manager man = new Manager("샤보", 2000 , "강아지");
		System.out.println(man.getEmployee());
		System.out.println(man.getManager());

	}

}
