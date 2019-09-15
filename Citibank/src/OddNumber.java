
public class OddNumber {

	static int[] oddNumbers(int l, int r) {
		if (r <= l)
			return null;
		int size = ((r - l) / 2) + 1;
		int arr[] = new int[size];
		int p = 0;
		for (int i = l; i <= r; i++) {

			if (i % 2 != 0) {
				arr[p] = i;
				p++;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int result[] = oddNumbers(2, 9);
		System.out.print("Odd numbers between 2 & 9 are: ");
		for(int j=0;j<result.length;j++) {
			System.out.print(result[j]+" ");	
		}
	}
}
