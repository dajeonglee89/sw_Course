package a;

public class AccessEx {
	 private     int a = 10; // ���� Ŭ���� �������� ����
	 /*package*/ int b = 20; // ���� ��Ű�� �������� ����
	 protected   int c = 30; // ���� ��Ű�� + �ٸ���Ű���� ��ӹ��� �ڽ�Ŭ�������� ���ٰ���
	 public	     int d = 40; // �ٸ� ��Ű�������� ���ٰ���
	 
	 public void printField() {
		 System.out.println("AcceEx - printField()");
		 System.out.println("a = " + a);
		 System.out.println("b = " + b);
		 System.out.println("c = " + c);
		 System.out.println("d = " + d);
	 }
	 
}
