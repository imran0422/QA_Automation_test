package webTest;

public class Test2 {
	int a = 5;
	int b = 10;
	long e= 18375;
	short s= 35;
	boolean t=true;
	char c='i';
	float f= 35.23F;
	double d=45678d;
	byte byt=-10;
   
	public static void main(String[] args) {
		Test2 obj = new Test2();
		obj.sub1();
		obj.sub2();
		obj.sub3(20, 25,30);
		obj.sub3(21, 26,31);
		int abc= obj.sub4();
		System.out.println(obj.sub4());
		System.out.println(abc);
	}

	public void sub1() {
		int c=a+b;
		System.out.println("Additon of a+b= " +c);

	}
	protected int sub2() {
		int x=4;
		int y=3;
		int z=x*y;
		return z;
	}
	public void sub3(int Q, int V, int W) {
		int x=Q*W;
		int y=V*W;
		System.out.println(x);
		System.out.println(y);
	
	}
	public int sub4() {
		int c=b-a;
		System.out.println(c);
		return c;
		
	}
	
}
