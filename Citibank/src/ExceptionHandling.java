
public class ExceptionHandling {

	public static void exception() throws InterruptedException{
		System.out.println("Before Try Block");
		try {
			System.out.println("In Try block");
			int devide1 = 10 / 2;
			System.out.println("devide 1:" + devide1);
		} catch (Throwable t) {
			System.out.println("Catch Block Started");
			int devide2 = 10 / 0;
			System.out.println("devide 2:" + devide2);
			System.out.println("Catch Block Ending");
		}
		
		Thread.sleep(1000);
		
		
		System.out.println("After Catch Block");
	}

	public static void main(String[] args) throws InterruptedException{
		exception();
	}
}