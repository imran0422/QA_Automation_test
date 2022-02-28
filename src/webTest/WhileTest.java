package webTest;

public class WhileTest {

	public static void main(String[] args) {
		WhileTest obj = new WhileTest();
		obj.sub1();
	}

	public void sub1() {
		int i = 1;
		int j = i + 10;
		while (j<=100) {
		System.out.println(j);
		j++;
		}
	}
}
