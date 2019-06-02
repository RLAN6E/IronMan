package parts;

import basic_operators.LengthFixedVector;
import basic_operators.Point;
import basic_operators.Vector;

public abstract class ArmPart {

	LengthFixedVector description;

	private final double length;

	public ArmPart(double l,Point base,int dimension) {
		length = l;
		description= new LengthFixedVector(base, length, dimension);
	}
	
	public ArmPart() {
		length =0;
	}

	public double getLength() {
		return length;
	}

	public LengthFixedVector getVector() {
		return description;
	}
	
	public Point getEndpoint() {
		return description.getEndpoint();
	}
}
