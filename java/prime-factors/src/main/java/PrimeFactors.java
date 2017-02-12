import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PrimeFactors {

	public static List<Long> getForNumber(long input) {
		// Fermat's factorization method
		List<Long> primeFactors = new LinkedList<Long>();
		fermat(input, primeFactors);
		Collections.sort(primeFactors);
		return primeFactors;
	}
	
	private static List<Long> fermat(long n, List<Long> primeFactors) {
		// precondition
		while (n % 2 == 0) {
			primeFactors.add(2L);
			n /= 2;
		}

		if (n == 1) return primeFactors;

		long x = (long) Math.ceil(Math.sqrt(n));
		long r = x*x - n;
		while (Math.pow(Math.round(Math.sqrt(r)), 2.0d) != (double) r) {
			r = r + 2*x + 1;
			x++;
		}
		long y = (long) Math.sqrt(r);

		long a = x + y;
		if (a == n) {
			primeFactors.add(a);
		} else {
			long b = x - y;
			fermat(a, primeFactors);
			fermat(b, primeFactors);
		}
		return primeFactors;
	}
	
	
}
