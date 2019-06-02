package basic_operators;

public class Vector {

	protected double[] coords;
	private int dimension;
	private Point base;

	// CONSTRUCTORS
	public Vector(Point p, double... aCoords) {
		coords = aCoords;
		dimension = coords.length;

		if (p == null) {
			base = new Point(3);
		} else {
			base = p;
		}
	}

	public Vector(Point p, double length, int dim) {
		coords = new double[dim];
		dimension = dim;
		coords[0] = length;
		if (p == null) {
			base = new Point(3);
		} else {
			base = p;
		}
	}

	public Vector(Point p, Point p1, Point p2) {
		if (p == null) {
			base = new Point(3);
		} else {
			base = p;
		}

		dimension = 3;
		coords = new double[3];

		coords[0] = p1.getCorrd(0) - p2.getCorrd(0);
		coords[1] = p1.getCorrd(1) - p2.getCorrd(1);
		coords[2] = p1.getCorrd(2) - p2.getCorrd(2);

	}

	public Vector() {

	}

	// GETTER
	public Point getBase() {

		return base;

	}

	public double computeLength() {
		double addAndSquare = 0;
		for (int i = 0; i < dimension; i++) {
			if (dimension > 2) {
				break;
			}
			addAndSquare += Math.pow(coords[i], 2);
		}
		return Math.sqrt(addAndSquare);
	}

	public double getCoordAt(int pos) {
		if (pos <= dimension) {
			return coords[pos];
		} else {
			return 0;
		}
	}

	public double[] getCoords() {
		return coords;
	}

	public Point getEndpoint() {
		double[] endpointVals = new double[dimension];

		for (int i = 0; i < dimension; i++) {
			endpointVals[i] = coords[i] + getBase().getCorrd(i);
		}
		return new Point(endpointVals);

	}

	// COORDINATE SETTER

	public void setX(double x) {
		coords[0] = x;

	}

	public void setY(double y) {
		coords[1] = y;

	}

	public void setZ(double z) {
		coords[2] = z;

	}

	public void setCoords(double aX, double aY, double aZ) {
		coords[0] = aX;
		coords[1] = aY;
		coords[2] = aZ;
	}

}
