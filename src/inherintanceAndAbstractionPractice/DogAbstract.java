package inherintanceAndAbstractionPractice;

public class DogAbstract {

	public static void main(String[] args) {
		DogAbstract myDog = new DogAbstract();
		myDog.animalSound();
		myDog.sleep();
		myDog.birdsound();
		myDog.natureSound();

	}

	public void animalSound() {
		System.out.println("Bow Bow Bow");
	}

	public void sleep() {
		System.out.println("Zzz");
		
	}
	public void birdsound() {
		System.out.println("Ku Ku Ku");
	}
	public void natureSound() {
		System.out.println("Raining Raining");
	}
}