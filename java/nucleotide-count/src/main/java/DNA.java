import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DNA {
	private final String dna;
	
	public DNA(String dna) {
		this.dna = dna;
	}
	
	public int count (char nuc) {
		if (!(nuc == 'A' || nuc == 'C' || nuc == 'G' || nuc == 'T'))
			throw new IllegalArgumentException();
		return (int) dna.chars().filter(c -> c == nuc).count();
	}

	public Map<Character, Integer> nucleotideCounts() {
		Map<Character, Integer> counts = new HashMap<Character, Integer>();
		counts.put('A', 0);
		counts.put('C', 0);
		counts.put('G', 0);
		counts.put('T', 0);
		for (char c : dna.toCharArray()) {
			counts.compute(c, (k,v) -> ++v);
		}
		return counts;
	}
}
