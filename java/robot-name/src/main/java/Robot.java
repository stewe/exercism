import java.util.Random;
import java.util.Vector;
import java.util.concurrent.ThreadLocalRandom;

public class Robot {

	private String name;
	static Vector<String> namesInUse = new Vector<String>(); // Vector is thread-safe

	public Robot() {
		this.name = generateName();
		namesInUse.add(name);
	}

	private String generateName() {
		String name;
		do {  
			Random rnd = ThreadLocalRandom.current();
			name = String.format("%c%c%03d", rndAToZ(rnd), rndAToZ(rnd), rnd.nextInt(1000));
		} while (namesInUse.contains(name));
		return name;
	}

	private char rndAToZ(Random rnd) {
		return (char) (rnd.nextInt(26) + 'A');
	}

	public String getName() {
		return this.name;
	}

	public void reset() {
		String newName = generateName();
		namesInUse.remove(this.name);
		this.name = newName;
		namesInUse.add(newName);
	}
	
	public static void main(String[] args) {
		Robot r = new Robot();
		for (int i = 0; i < 10; i++) {
			System.out.println(r.getName());
			r.reset();
		}
	}

}