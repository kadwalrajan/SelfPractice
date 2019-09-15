
public class Arrays {

	public void oneDArray(){
		int number[] = new int[10];
		int j = 100;
		for (int i = 0; i < number.length; i++) {
			number[i] = j;
			System.out.println("number in position " + i + " is: " + j);
			j++;
		}
	}
	public void twoDArray() {
		int rows = 5;
		int cols = 5;
		int data = 10;
		int number[][] = new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				number[i][j]=data;
				data++;
			}
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(number[i][j]+" ");
			}System.out.println(" ");
		}
	}
	public static void main(String[] args) {
		Arrays ary= new Arrays();
		ary.oneDArray();
		ary.twoDArray();
	}
}
