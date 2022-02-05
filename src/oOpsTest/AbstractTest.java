package oOpsTest;

public class AbstractTest extends TestAbstract {

	public static void main(String[] args) {
		AbstractTest obj = new AbstractTest();
		obj.KingKong();
		obj.abc();
		obj.hhh();

	}
	
	public void abc() {
		System.out.println("abstract method");
	}
	public void hhh() {
		System.out.println("method from this class");
	}

}
