
public class Triangle {

	private final TriangleKind kind;
	
	public Triangle(double a, double b, double c) throws TriangleException {
		if (a <= 0 || b <= 0 || c <= 0
				|| a+b <= c || a+c <= b || b+c <= a) {
			throw new TriangleException();
		} else if (a == b && a ==c) {
			kind = TriangleKind.EQUILATERAL;
		} else if (a == b || a ==c || b ==c) {
			kind = TriangleKind.ISOSCELES;
		} else {
			kind = TriangleKind.SCALENE;
		}
	}

	public TriangleKind getKind() {
		return kind;
	}

}
