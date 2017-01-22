import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Anagram {

	final String word;
	final int[] wordBase;
	
	public Anagram(String word) {
		this.word = word;
		this.wordBase = toNormalizedArray(word);
	}

	private int[] toNormalizedArray(String word) {
		return word.toLowerCase().chars().sorted().toArray();
	}

	public List<String> match(List<String> wordList) {
		return wordList.stream()
				.filter(word -> (!word.equalsIgnoreCase(this.word)
								&& Arrays.equals(toNormalizedArray(word), wordBase)))
				.collect(Collectors.toList());
	}
}
