package Abstraction;

public class NormalClass extends AbstractClass1{

	public static void main(String[] args) {

		
		
		NormalClass nc = new NormalClass();
		nc.abstractMethod1();
		nc.concreteMethod1();
		nc.myMethod();
		nc.main(null);
		
		
	}

	@Override
	public void abstractMethod1() {
		// TODO Auto-generated method stub
		
	}

	public void myMethod() {
		System.out.println("My Method");
	}

}
