import java.util.Arrays;
import java.util.stream.Collectors;

public class Acronym {

	public static String generate(String phrase) {
		return Arrays.stream(phrase.trim().split("\\W"))
					.filter(w -> !w.isEmpty())
					.map(s -> (s.toUpperCase().equals(s)) ? s.substring(0, 1) : s.substring(0, 1).toUpperCase() + s.substring(1) )
					.collect(Collectors.joining(""))
					.replaceAll("[^A-Z]", "");
	}

}
