package inherintanceAndAbstractionPractice;

public class SuperclassB extends SuperclassC {

	public static void main(String[] args) {
		SuperclassB obj = new SuperclassB();
		obj.sub1();
		obj.sub2(34, 45);
		obj.sub3();
		obj.subC();
	}

	public void sub1() {
		long i = 324234, j = 2023324432;
		long sum = i + j;
		System.out.println("This is the SUM of 2 Numbers " + sum);
	}

	public void sub2(int A, int B) {
		int C = A * B;
		System.out.println("This is Multiplication of 2 Numbers " + C);
	}

	public void sub3() {
		int E = 345, F = 123;
		int G = E - F;
		System.out.println("This is the Subtraction of 2 Numbers " + G);
	}
}