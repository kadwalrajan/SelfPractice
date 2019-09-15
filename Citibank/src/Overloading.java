
public class Overloading {
	public static void main(String[] args) {

		Overloading ol= new Overloading();
		ol.addition(1,1,1,1,1,1,1,1,1,1);
		
		
	}
public void addition(int... abc) {
	int result = 0;
	for(int i=0;i<abc.length;i++) {
		
		result = result + abc[i];
	}
	System.out.println(result);
}
}
