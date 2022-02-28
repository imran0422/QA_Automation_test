
package webTest;

public class ReturnTest {

	public static void main(String args[]) {
		ReturnTest test = new ReturnTest();
		// int add = test.add();
		System.out.println(test.add());
		test.Str();
		System.out.println(test.Str());
		test.Divide();
		System.out.println(test.Divide());
	}

	public int add() { // without arguments
		int x = 30;
		int y = 70;
		int z = x + y;
		return z;
	}

	public String Str() {
		String name = "Imran";
		return name;

	}

	public int Divide() {
		int a = 100, b = 200;
		int c = b / a;
		return c;
	}
}