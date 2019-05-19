package parts;

import basic_operators.LengthFixedVector;
import basic_operators.Point;
import basic_operators.Vector;

public abstract class ArmPart {

	LengthFixedVector description;

	final double length;

	public ArmPart(double l,Vector baseV,int dimension) {
		length = l;
		description= new LengthFixedVector(baseV, length, dimension);
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
