package webTest;

//This program calculates simple interest on a loan using the formulae P+R+T/100 
// Principle + Rate of Interest + Time.

public class SimpleInterest {
	static float P=35678F, R=7F, T=48F;

	public static void main(String[] args) {
		SimpleInterest SmpInt= new SimpleInterest();
		SmpInt.sub1();
		
	}
	public void sub1() {
		float ST;
		ST = (P*R*T)/100;
		System.out.println("Simple Interest is= " + ST);
	}

}
 