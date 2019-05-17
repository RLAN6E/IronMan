package basic_operators;

public class Vector_operator {

	public Vector_operator() {

	}

	public double scalar(Vector v1, Vector v2) {

		int counter;
		int c1 = v1.getCoords().length;
		int c2 = v2.getCoords().length;
		double scal = 0.0;

		if (c1 == c2 || c1 < c2) {
			counter = c1;
		} else {
			counter = c2;
		}

		for (int i = 0; i < counter; i++) {
			scal += v1.getCoordAt(i) * v2.getCoordAt(i);
		}
		return scal;
	}

	public Vector add(Vector v1, Vector v2) {

		int counter;
		int c1 = v1.getCoords().length;
		int c2 = v2.getCoords().length;

		if (c1 == c2 || c1 > c2) {
			counter = c1;
		} else {
			counter = c2;
		}
		double[] coordsNV = new double[counter];
		for (int i = 0; i < counter; i++) {
			coordsNV[i] = v1.getCoordAt(i) + v2.getCoordAt(i);
		}
		return new Vector(v1, coordsNV);
	}

	public Vector crossP(Vector v1, Vector v2) {
		if (v1.getCoords().length < 3 || v2.getCoords().length < 3) {
			throw new RuntimeException("3");
		} else {
			double a1 = v1.getCoordAt(0);
			double b1 = v2.getCoordAt(0);
			double a2 = v1.getCoordAt(1);
			double b2 = v2.getCoordAt(1);
			double a3 = v1.getCoordAt(2);
			double b3 = v1.getCoordAt(2);

			double[] coordsNV = new double[3];

			coordsNV[0] = (a2 * b3) - (a3 * b2);
			coordsNV[1] = (a3 * b1) - (a1 * b3);
			coordsNV[2] = (a1 * b2) - (a2 * b1);

			return new Vector(v1, coordsNV);
		}
	}

	public double angle(Vector v1, Vector v2) {
		return Math.acos((this.scalar(v1, v2)) / (v1.computeLength() * v2.computeLength()));
	}

}
