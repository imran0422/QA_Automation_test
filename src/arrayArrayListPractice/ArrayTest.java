package arrayArrayListPractice;

public class ArrayTest {

	public static void main(String[] args) {

		int arrayTest[] = { 1, 25, 83 };

		System.out.println(arrayTest[0]);
		System.out.println(arrayTest[2]);

		String name[] = { "lina", "prince", "imran", "nahid" };

		System.out.println(name[1]);

		int[] obj = new int[5];
		obj[0] = 7;
		obj[1] = 9;
		obj[2] = 10;
		obj[3] = 20;
		obj[4] = 15;
		System.out.println(obj[3]);

		String[] obj1 = new String[3];
		obj1[0] = "KHAN";
		obj1[1] = "Nahid";
		obj1[2] = "Prince";
		System.out.println(obj1[1]);

		int[][] numbers = { { 4, 6, 20 }, { 7, 9, 1 }, { 12, 10, 29 } };

//		System.out.println(numbers[0][1]);
//		System.out.println(numbers[1][0]);
//		System.out.println(numbers[2][2]);

		for (int i = 0; i < 3; i++) {
			for (int y = 0; y < 3; y++) {
				System.out.println(numbers[i][y]);
			}
		}

	}

}
