package constructorAndSuperKey;

public class ConstructTest1 {
	
	public ConstructTest1() {
		System.out.println("I am in the constructor");
	}
	public ConstructTest1(String name) {
		System.out.println("My name is: "+name);
	}


	public static void main(String[] args) {
		ConstructTest1 obj = new ConstructTest1();
		ConstructTest1 obj1 = new ConstructTest1("Imran");
		
	}
	


}
