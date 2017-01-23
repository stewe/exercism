public class PhoneNumber {
	
	private static final String BAD_NUMBER = "0000000000";
	String no;
	
	public PhoneNumber(String no) {
		this.no = cleanNumber(no);
	}
	
	public String getNumber() {
		return this.no;
	}
	
	public String getAreaCode() {
		return this.no.substring(0, 3);
	}
	
	public String pretty() {
		return String.format("(%s) %s-%s", getAreaCode(),
											this.no.substring(3, 6),
											this.no.substring(6));
	}
	
	private String cleanNumber(String no) {
		String cleanedNo = no.replaceAll("[^0-9]", "");
		int len = cleanedNo.length();
		if (len < 10 || len > 11 || (len == 11 && no.charAt(0) != '1')) {
			return BAD_NUMBER;
		}
		cleanedNo = (len == 11) ? cleanedNo.substring(1) : cleanedNo;
		
		return cleanedNo;
	}
	
}