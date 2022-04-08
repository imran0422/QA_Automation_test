package javaPractice;

public class AvgArray {

	public static void main(String[] args) {
		double[] arr = { 3.5, 4, 5, 6, 7 };
		double total = 0;
		for (int i = 0; i < arr.length; i++) {
			total = total + arr[i];
		}
		double average = total / arr.length;
		System.out.println("Average of the numbers is:" + average);
	}

}
