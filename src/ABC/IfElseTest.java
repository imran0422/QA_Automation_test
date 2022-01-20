package ABC;

public class IfElseTest {

	public static void main(String[] args) {
		IfElseTest vote = new IfElseTest();
		vote.voter();
	}
	public void voter() {
		int age =75; 
		if(age<18) {
			System.out.println("you are not a voter");
		}
		else if(age>=18 && age<=50) {
			System.out.println("you are a voter");
			
		}
		else if (age>50 && age<=80) {
			System.out.println("senior voter");
			if(age>70 && age<=80) {
				System.out.println("give them a candy");
			}
		}
		else {
			System.out.println("not a voter");
		}
	}

}
