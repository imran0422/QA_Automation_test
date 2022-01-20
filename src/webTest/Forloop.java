package webTest;

public class Forloop {

	public static void main(String[] args) {
		Forloop sub1 = new Forloop();
		sub1.floop();
		
	}
	public void floop() {
		for(int i=1; i<=25; i++) {
			if(i%2==0 || i%3==0) {
				System.out.println(i+ "= Red");
			}
			else if(i%5==0) {
				System.out.println(i+ "= White");
			}
		}
		
		
	}

}
