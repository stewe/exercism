import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {

	private static Map<Integer, String> ONE_MAPPING = new HashMap<Integer, String>() {
		private static final long serialVersionUID = 2944184713593790581L;
		{
			put(0, "");
			put(1, "I");
			put(2, "II");
			put(3, "III");
			put(4, "IV");
			put(5, "V");
			put(6, "VI");
			put(7, "VII");
			put(8, "VIII");
			put(9, "IX");
		}
	};
	
	private static Map<Integer, String> TEN_MAPPING = new HashMap<Integer, String>() {
		private static final long serialVersionUID = -5839825814166241445L;
		{
			put(0, "");
			put(1, "X");
			put(2, "XX");
			put(3, "XXX");
			put(4, "XL");
			put(5, "L");
			put(6, "LX");
			put(7, "LXX");
			put(8, "XXC");
			put(9, "XC");
		}
	};
	
	private static Map<Integer, String> HUNDRED_MAPPING = new HashMap<Integer, String>() {
		private static final long serialVersionUID = 3750433984284783371L;
		{
			put(0, "");
			put(1, "C");
			put(2, "CC");
			put(3, "CCC");
			put(4, "CD");
			put(5, "D");
			put(6, "DC");
			put(7, "DCC");
			put(8, "CCM");
			put(9, "CM");
		}
	};

	private static Map<Integer, String> THOUSAND_MAPPING = new HashMap<Integer, String>() {
		private static final long serialVersionUID = 5620297748929007548L;
		{
			put(0, "");
			put(1, "M");
			put(2, "MM");
			put(3, "MMM");
		}
	};
	final String romanNumeral;

	public RomanNumeral(int arabicNumeral) {
		if (arabicNumeral < 0 || arabicNumeral > 3000) {
			throw new InvalidParameterException("Only numbers between 0 and 3000 accepted.");
		}

		StringBuilder builder = new StringBuilder();
		builder.append(THOUSAND_MAPPING.get(arabicNumeral / 1000));
		builder.append(HUNDRED_MAPPING.get((arabicNumeral % 1000 ) / 100));
		builder.append(TEN_MAPPING.get((arabicNumeral % 100 ) / 10));
		builder.append(ONE_MAPPING.get(arabicNumeral % 10));

		romanNumeral = builder.toString();
	}

	public String getRomanNumeral() {
		return this.romanNumeral;
	}

}
