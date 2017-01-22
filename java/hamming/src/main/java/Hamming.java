public class Hamming {

	public static int compute(String dnaA, String dnaB) {
		if (dnaA == null || dnaB == null || dnaA.length() != dnaB.length()) {
			throw new IllegalArgumentException();
		}
		int distance = 0;
		for (int i = 0; i < dnaA.length(); i++) {
			if (dnaA.charAt(i) != dnaB.charAt(i)) distance++;
		}
		
		return distance;
	}
}
