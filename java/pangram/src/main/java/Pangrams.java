import java.util.stream.Collectors;

public class Pangrams {

	public static boolean isPangram(String input) {
		if (input == null || input.isEmpty()) return false;
		return input.toLowerCase()
					.replaceAll("[^a-z]", "")
					.chars()
					.boxed()
					.collect(Collectors.toSet())
					.size() == 26;
	}

}
