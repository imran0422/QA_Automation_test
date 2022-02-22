package inherintanceAndAbstractionPractice;

public class AbstractImplementation {
	public static void main(String[] args) {
		AbstractImplementation obj = new AbstractImplementation();
		obj.Abs22();
		obj.Abs2();
	}

	public void Abs22() {
		System.out.println("This is Abstract Method");

	}

	public void Abs2() {
		int i, j = 45, k = 30;
		i = j + k;
		if (i < 20) {
			System.out.println("I is Less Than 20");
		} else if (i > 20 && i <= 30) {
			System.out.println("I is Greater Than 20");
		} else {
			System.out.println("I is Greater Than 30");
		}
	}

}
