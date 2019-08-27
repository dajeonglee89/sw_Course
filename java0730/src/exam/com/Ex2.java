package exam.com;


// super. this. <- ��ü�� ���ٰ��ɿ��� �������� ����
// super. �� �θ����� �ڽĸ�� �̸��� ������� ���� ������ ���� �����. 

class Employee{ //���Ŭ����
	private String name; //�̸�
	private int salary; //�޿�
	
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
	String depart; //�μ���
//	String name; // �ʵ� �������̵�
	
	
	// ������ name salary depart �޴� ������
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
		Employee emp = new Employee("�̴���" , 100000);
		System.out.println(emp.getEmployee());
		
		Manager man = new Manager("����", 2000 , "������");
		System.out.println(man.getEmployee());
		System.out.println(man.getManager());

	}

}
