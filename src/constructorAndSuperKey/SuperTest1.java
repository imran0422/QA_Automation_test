package constructorAndSuperKey;

public class SuperTest1 extends SuperTest2 {
 // String name = "Imran";
//  public SuperTest1() {
//	  super();
//  }
	public static void main(String[] args) {
		SuperTest1 obj = new SuperTest1();
		obj.myName(9);
	}
	public void myName(int name) {
		super.myName(name);
		System.out.println(name);
	}

}
