import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DNA {
	private final String dna;
    private List<Character> nucleotides = Arrays.asList('A', 'C', 'G', 'T');

	
	public DNA(String dna) {
		this.dna = dna;
	}
	
	public int count (char nuc) {
		if (!nucleotides.contains(nuc)) throw new IllegalArgumentException();
		return (int) dna.chars().filter(c -> c == nuc).count();
	}

	public Map<Character, Integer> nucleotideCounts() {
		Map<Character, Integer> counts = new HashMap<Character, Integer>();
		nucleotides.forEach(nuc -> counts.put(nuc, count(nuc)));
		return counts;
	}
}
