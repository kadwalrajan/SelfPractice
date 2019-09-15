
public class Calculator {
/*int x = 3;
int y = 1;*/
	public void getSum(int x, int y) {
		getSub(x,y);
		int p = x+y;
		if(p>5)
			{
			System.out.println("Added number is :"+p);
			}
			else {
				System.out.println("Added number is not greater than 5");
			}
		
		
	}

	public void getSub(int x, int y) {
		getDiv(x,y);
		int p= x - y;
		if(p>5)
		{
		System.out.println("Sub number is :"+p);
		}
		else {
			System.out.println("Sub number is not greater than 5");
		}
	}

	public void getDiv(float x, float y) {
		getMul(x,y);
		int p = (int)(x / y);
		if(p>5)
		{
		System.out.println("Div number is :"+p);
		}
		else {
			System.out.println("Div number is not greater than 5");
		}
	}

	public void getMul(float x, float y) {
		if(Math.max(x, y)>5)
			System.out.println("Max no is :"+Math.max(x, y));
		else 
			System.out.println("Min no is :"+Math.min(x, y));
		float p = x*y;
		if(p>5)
		{
		System.out.println("Mul number is :"+p);
		}
		else {
			System.out.println("Mul number is not greater than 5");
		}
	}
	
	public Calculator() {
		System.out.println("Inside Constructor");
	}

	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.getMul(2, 3);
	}
}
