package webTest;


public class Test1 {
	String a="QA Traning Class";
	int AB = 7;
	int YZ = 9;
	
	public static void main(String[] args) {
		Test1 obj= new Test1();
		Test2 obj2 = new Test2();
		System.out.println("I am from Test2= "+obj2.sub2());
		obj.mango();
		obj.orange();
	}
	
	public int mango(){
		int x=2;
		int y=4;
		int c=x+y;
		System.out.println("Addtion of x and y= " +c);
		return c;
	}
	public void orange() {
		a="a";
		System.out.println("a");
	}
	
	}


