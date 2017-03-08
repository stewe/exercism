import java.util.stream.IntStream;

public final class Difference {

	public static int computeSquareOfSumTo(int n) {
		return (int) Math.pow(IntStream.rangeClosed(1, n).sum(), 2);
	}

	public static int computeSumOfSquaresTo(int n) {
		return IntStream.rangeClosed(1, n).map(i -> i*i).sum();
	}

	public static int betweenSquareOfSumAndSumOfSquaresTo(int n) {
		return Math.abs(computeSquareOfSumTo(n) - computeSumOfSquaresTo(n));
	}
    


}
