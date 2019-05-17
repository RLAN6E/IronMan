package basic_operators;

public class Vector {

	protected double[] coords;
	private int dimension;
	private Vector ortV;

	// CONSTRUCTORS
	public Vector(Vector oV, double... aCoords) {
		coords = aCoords;
		dimension = coords.length;

		if (oV == null) {
			ortV = new NullVector();
		} else {
			ortV = oV;
		}
	}

	public Vector(Vector oV, double length, int dim) {
		coords = new double[dim];
		dimension = dim;
		coords[1] = length;
		if (oV == null) {
			ortV = new NullVector();
		} else {
			ortV = oV;
		}
	}
	
	public Vector() {
		
	}

	// GETTER
	public Point getBase() {

		return ortV.getEndpoint();

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
		computeLength();
	}

	public void setY(double y) {
		coords[1] = y;
		computeLength();
	}

	public void setZ(double z) {
		coords[2] = z;
		computeLength();
	}

}
