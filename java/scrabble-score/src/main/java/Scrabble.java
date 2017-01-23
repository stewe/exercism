import java.util.HashMap;
import java.util.Map;

public class Scrabble {

	private static final String SCORE_1 = "AEIOULNRST";
	private static final String SCORE_2 = "DG";
	private static final String SCORE_3 = "BCMP";
	private static final String SCORE_4 = "FHVWY";
	private static final String SCORE_5 = "K";
	private static final String SCORE_8 = "JX";
	private static final String SCORE_10 = "QZ";
	private final String word;
	private Map<Character, Integer> scoreMap;
	
	public Scrabble(String scrabbleInput) {
		word = scrabbleInput == null ? null : scrabbleInput.toUpperCase().replaceAll("[^A-Z]", "");
		
		scoreMap = new HashMap<Character, Integer>();
		SCORE_1.chars().forEach(c -> scoreMap.put((char) c, 1));
		SCORE_2.chars().forEach(c -> scoreMap.put((char) c, 2));
		SCORE_3.chars().forEach(c -> scoreMap.put((char) c, 3));
		SCORE_4.chars().forEach(c -> scoreMap.put((char) c, 4));
		SCORE_5.chars().forEach(c -> scoreMap.put((char) c, 5));
		SCORE_8.chars().forEach(c -> scoreMap.put((char) c, 8));
		SCORE_10.chars().forEach(c -> scoreMap.put((char) c, 10));
	}

	public int getScore() {
		int score = 0;
		if (word != null && !word.isEmpty()) {
			score = word.chars().map(c -> scoreMap.get((char) c)).sum();
		}
		return score;
	}

}
