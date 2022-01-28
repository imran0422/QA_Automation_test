package webTest;

public class Primenumber {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0) {
				System.out.println("This is a Prime Number " + i);
				if (i % 3 == 0) {
					System.out.println("This is not a Prime Number" + i);
				}
			} else if (i == 30) {
				System.out.println("This is a Prime Number " + i);
			}
		}

	}
}
