package javaPractice;

public class ReturnTest {

	public static void main(String[] args) {
		System.out.println(abc());
		System.out.println(xyz());
		System.out.println(return1());

	}

	public static int abc() {
		int x = 5;
		return 5 + x;

	}

	public static String xyz() {
		String a = "One";
		return a;
	}

	public static int return1() {
		int ab = 12;
		int cd = 15;
		int ef = 20;
		int yyy = ab * cd * ef;
		return yyy;
	}

	public void cnn() {
		System.out.println(return1());
	}
}
