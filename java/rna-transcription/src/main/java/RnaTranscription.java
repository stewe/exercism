public class RnaTranscription {
	public String ofDna(String dnaString) {
		StringBuilder builder = new StringBuilder();
		dnaString.chars().map( c -> { switch ((char) c) {
										case 'G': return (int) 'C';
										case 'C': return (int) 'G';
										case 'T': return (int) 'A';
										case 'A': return (int) 'U';
										default : return 0; }})
							.forEach(c -> builder.append((char) c));
		return builder.toString();
	}
}