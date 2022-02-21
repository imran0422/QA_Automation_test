package encapsulationTest;

public class ExamResults {
	private String English, Maths, Physics;
	private int i, j, k;

	public void setEnglish(String English) {
		this.English = English;
	}

	public String getEnglish() { // how to combine all in one ?
		return English;
	}

	public void setMaths(String Maths) {
		this.Maths = Maths;
	}

	public String getMaths() {
		return Maths;
	}

	public void setPhysics(String Physics) {
		this.Physics = Physics;
	}

	public String getPhysics() {
		return Physics;
	}

	public void seti(int i) {
		this.i = i;
	}

	public int geti() {
		return i;
	}

	public void setj(int j) {
		this.j = j;

	}

	public int getj() {
		return j;

	}

	public void setk(int k) {
		this.k = k;
	}

	public int getk() {
		return k;
	}
}
