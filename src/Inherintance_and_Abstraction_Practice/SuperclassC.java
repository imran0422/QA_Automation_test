package Inherintance_and_Abstraction_Practice;

public class SuperclassC extends AbstractClass1 {

	public static void main(String[] args) {
		SuperclassC obj = new SuperclassC();
		obj.subC();
		obj.Abs1();
		obj.Abs2();
	}

	public void subC() {
		for (int i = 1; i <= 10; i++)
			if (i % 2 == 0)
				System.out.println(+i + ">>This is an Even Number");
			else {
				System.out.println(+i + ">>This is an ODD Number");
			}
	}

	public void Abs2() {
		// This class is in the AbstractClass1.
		int i = 1, j = 3;
		int k = i + j;
		System.out.println(+k);
	}

}
