package webTest;

public class Greatestof3Numbers {

	public static void main(String[] args) {
		int A = 156;
		int B = 56;
		int C = 75;
		if (A > B && A > C) {
			System.out.println("A is Greater Than B & C ");
		} else if (B > A && B > C) {
			System.out.println("B is Greater Than A & C ");
		} else if (C > A && C > B) {
			System.out.println("C is Greater Than A & B ");
		}
	}

}
