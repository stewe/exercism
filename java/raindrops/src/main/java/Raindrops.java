
public class Raindrops {

	public static String convert(int inputNumber) {
		StringBuilder builder = new StringBuilder();
		if (inputNumber % 3 == 0) builder.append("Pling");
		if (inputNumber % 5 == 0) builder.append("Plang");
		if (inputNumber % 7 == 0) builder.append("Plong");
		if (builder.length() == 0) builder.append(Integer.toString(inputNumber));
		return builder.toString();
	}

}
