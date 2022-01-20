package webTest;

/* Write an if else statement for students with 3 subjects English, Math and Physics and give
 them grades A,B,C depending on the Average marks they got also display failed if any student
 gets less than 40 Marks in any of the subjects
 */

public class ClassGrade {
	int English=70, Math=67, Physics=56;
	int Avg = (English + Math + Physics) / 3;
	char Grade1 = 'A', Grade2='B', Grade3='C', Grade4='F' ;
	int subject;
	

	public static void main(String[] args) {
		ClassGrade subject = new ClassGrade();
		subject.Marks();
	}

	public void Marks() {
		if (English > 100 || Math > 100 || Physics > 100) {
			System.out.println("System Error");
		} else if (English < 40 || Math < 40 || Physics < 40) {
			System.out.println("You have Failed - Work Hard");
		} else if (English >= 40 || Math >= 40 || Physics >= 40) {
			if (Avg >= 40 && Avg < 60) {
				System.out.println("Your Average is " + Avg + " " + Grade3 + " " + "Average");
			} else if (Avg >= 60 && Avg < 80) {
				System.out.println("Your Average is " + Avg + " " + Grade2 + " " + "Good");
			} else if (Avg >= 80 && Avg <= 100) {
				System.out.println("Your Average is " + Avg + " " + Grade1 + " " + "Excellent");
			} else {
				System.out.println("System Error");
			}

		}
	}
}