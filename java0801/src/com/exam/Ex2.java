package com.exam;

abstract class AbsTest1{}

abstract class AbsTest2{}

interface ITest1{
	void iTest1Method();
}

interface ITest2{
	void iTest2Method();
}


//�������̽����� ��Ӱ���. ���߻�� ����.
interface ITest3 extends ITest1, ITest2{
	void iTest3Method();
}


class SubTest extends AbsTest1 implements ITest1{

	@Override
	public void iTest1Method() {		
	}	
}

class SubTest2 implements ITest1, ITest2{
	
	@Override
	public void iTest1Method() {		
	}	
	
	@Override
	public void iTest2Method() {		
	}	
	
}
class SubTest3 implements ITest3{
		
		@Override
		public void iTest1Method() {		
		}	
		
		@Override
		public void iTest2Method() {		
		}	
		
		@Override
		public void iTest3Method() {		
		}
}
		
public class Ex2 {

	public static void main(String[] args) {
		ITest3 it3 = new SubTest3();
		ITest1 it1 = it3;
		it1.iTest1Method();

		ITest1 it11 = new SubTest3();
		ITest3 it33 = (ITest3) it11;
		it33.iTest1Method();
		it33.iTest2Method();
		it33.iTest3Method();

	}

}
