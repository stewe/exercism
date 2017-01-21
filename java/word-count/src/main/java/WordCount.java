import java.util.HashMap;
import java.util.Map;

public class WordCount {

	public Map<String, Integer> phrase(String string) {
		Map<String, Integer> wordCount = new HashMap<String, Integer>();
		for (String word : string.split("[^a-zA-Z0-9]")) {
			if (!word.isEmpty()) {
				wordCount.compute(word.toLowerCase(), (k, count) -> (count == null) ? 1 : ++count);
			}
		}
		return wordCount;
	}
	
}
