public class Bob {

	public Object hey(String request) {
		String response = "Whatever.";
		if (request.trim().isEmpty()) {
			response = "Fine. Be that way!";
		} else if (request.endsWith("?")) {
			response = "Sure.";
		}
		String temp = request.replaceAll("[^\\p{Alpha}üäöÜÖÄß]", "");
		if (!temp.isEmpty() && temp.chars().allMatch(c -> (Character.isUpperCase(c)))) {
			response = "Whoa, chill out!";
		}
		return response;
	}

}
