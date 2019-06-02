package basic_operators;

public class LengthFixedVector extends Vector {

	private double length;

	public LengthFixedVector(Point p, double l, int dim) {
		super(p, l, dim);

		length = l;
	}

	public double getLength() {
		return length;
	}

	// MOVER
/*
	public void moveX(double xTarget) {
		
		double dX = Math.abs(xTarget - coords[0]);
		double dY = Math.abs(Math.sqrt(Math.pow(length, 2) - Math.pow(xTarget, 2)) - coords[1]);
		
		try {
		if (Double.isNaN(dX)||Double.isNaN(dY)) {
			throw new RuntimeException("2");
		} else {
			coords[0] = xTarget;
			coords[1] = Math.sqrt(Math.pow(length, 2) - Math.pow(xTarget, 2));
		}}catch (Exception e) {
			System.out.println("ERROR<2>");
		}

	}

	public void moveY(double yTarget) {

		double dY = Math.abs(yTarget - coords[0]);
		double dX = Math.abs(Math.sqrt(Math.pow(length, 2) - Math.pow(yTarget, 2)) - coords[1]);
		
		try {
		if (Double.isNaN(dX)||Double.isNaN(dY)) {
			throw new RuntimeException("2");
		} else {
			coords[0] = yTarget;
			coords[1] = Math.sqrt(Math.pow(length, 2) - Math.pow(yTarget, 2));
		}}catch (Exception e) {
			System.out.println("ERROR<2>");
		}
	}
	*/
}
