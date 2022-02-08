package Inherintance_and_Abstraction_Practice;

public class SubclassA extends SuperclassC { // Cannot inherit 2 classes using another extends command ? SuperclassB -
												// Father and SuperclassC Mother ?

	public static void main(String[] args) {
		SuperclassB obj = new SuperclassB();
		obj.sub1();
		obj.sub2(234, 3432);
		obj.sub3();
		obj.subC();
		obj.Abs1();
		obj.Abs2();
	}
}
