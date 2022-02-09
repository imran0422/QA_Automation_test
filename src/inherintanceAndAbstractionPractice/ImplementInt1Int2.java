package inherintanceAndAbstractionPractice;

public class ImplementInt1Int2 implements Inter1, Inter2 {

	public static void main(String[] args) {
		ImplementInt1Int2 obj =new ImplementInt1Int2();
		obj.Inter1_1();
		obj.Inter1_2();
		obj.Inter1_3();
		obj.Inter2_1();
		obj.Inter2_2();
	}

	public void Inter1_1() {
		System.out.println("This is coming from Inter1_1");

	}

	public void Inter1_2() {
		System.out.println("This is coming from Inter1_2");

	}

	public void Inter1_3() {
		System.out.println("This is Coming from Inter1_3");
	}

	public void Inter2_1() {
		System.out.println("This is Coming from Inter1_3");
	}

	public void Inter2_2() {
		System.out.println("This is Coming from Inter1_3");
	}
}
