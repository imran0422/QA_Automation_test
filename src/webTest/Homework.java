package webTest;

public class Homework {

	static int g;
	static int f;
	static int d;

	Homework() {
		System.out.println("print me first");
	}

	Homework(int x, int y, int z) {
		System.out.println("print me 2nd");
	}

	Homework(int x, int y) {
		int g = x;
		int f = y;

		System.out.println("print me 3rd" +g +f);
	}

	// Declare 2 Integer variables where one is 10times bigger then other;
	static int a = 10;
	static int b = 15;

	// Declare all primitive data types and assign values to it.

	static int c = 20;
	short St = 325;
	long Lng = 101245;
	byte byt = -126;
	float flt = -453.4f;
	double dbl = 67853.58d;
	char chr = 'z';
	boolean bln = true;
	boolean cln = false;

	public static void main(String[] args) {
		Homework obj = new Homework();
		Homework obj2 = new Homework(g, f, d);
		//Homework obj3 = new Homework(20, 30);
		obj.sub1();
		obj.sub2();
		obj.sub3("Mohammed", "Imran Khan");
		obj.sub4();
		int X = b - a;
		System.out.println("Subtraction of b-a= " + X);
		int Y = c - b;
		System.out.println("Subtraction of c-b= " + Y);
		obj2.sub5(20, 30, 40);
		obj2.sub5(27, 80, 70);
		obj2.sub5(240, 802, 79);

	}

	public void sub1() {
		int V = a * b;
		int W = b * c;
		System.out.println("Multiplication of a&b= " + V);
		System.out.println("Multiplication of b&c= " + W);
	}

	public void sub2() {
		int Q = (a + b) * 89;
		System.out.println("The Value of Q = " + Q);

	}

	public void sub3(String str, String abc) {
		System.out.println("My Last Name is = " + str + " " + abc);
		System.out.println("My First Name is = " + abc);
	}

	public void sub4() {
		System.out.println("My age is 34= " + bln + " " + cln);

	}

	public void sub5(int g, int f, int d) {
		int b = g + f;
		int c = d + f;
		System.out.println("Hi there it's me="+c + " " + b);

	}

}
