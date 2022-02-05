package webTest;

public class Greatestof3Numbers {
	static int A = 56;
	static int B = 56;
	static int C = 45;
	
	public static void main(String[] args) {
		String ab = "Error 2 or more Values are Equal";
		if (A > B && A > C) {
			System.out.println("A is Greater Than B & C ");
		} else if (B > A && B > C) {
			System.out.println("B is Greater Than A & C ");
		} else if (C > A && C > B) {
			System.out.println("C is Greater Than A & B ");
		}
		else {
			System.out.println(ab);
		}
	}

}