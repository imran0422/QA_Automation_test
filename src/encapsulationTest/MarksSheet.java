package encapsulationTest;

public class MarksSheet {
	public static void main(String[] args) {
		ExamResults obj = new ExamResults();
		obj.setEnglish("Eng");
		obj.setMaths("Math");
		obj.setPhysics("Phys");
		obj.seti(78);
		obj.setj(86);
		obj.setk(91);

		System.out.println(" " + obj.getEnglish() + " = " + obj.geti());
																		// anymore
	System.out.printf(obj.getMaths()); //{how to combine}
		// System.out.printf(obj.getPhysics());
		// System.out.println((obj.geti()));
		// System.out.println(obj.getj());
		// System.out.println(obj.getk());

	}
}
