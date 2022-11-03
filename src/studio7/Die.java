package studio7;

public class Die {
	private int faces;

	public Die(int initialFaces) {
		faces = initialFaces;
	}

	public int Generate() {
		return (int) (Math.random() * faces) + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die a = new Die(6);
		System.out.println(a.Generate());
	}

}
