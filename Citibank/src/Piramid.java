
public class Piramid {
	public void createPiramid(int r) {
		if (r % 2 != 0) {
			for (int i = 0; i < r / 2 + 1; i++) {
				int count = 0;
				for (int j = 1; j <= r; j++) {
					if (j == (r / 2 + 1) - i) {
						for (int k = j - i; k <= j + i; k++) {
							System.out.print("x");
							count++;
						}
						j = j + i * 2;
					} else {
						System.out.print(" ");
						count++;
					}
				}
				System.out.println(" "+count+" characters");
			}
		} else {
			System.out.println("Please Enter an ODD number");
		}
	}

	public static void main(String[] args) {
		Piramid cp = new Piramid();
		cp.createPiramid(5);
	}
}
