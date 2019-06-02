package parts;

import basic_operators.LengthFixedVector;
import basic_operators.Point;

public class Base extends ArmPart{
	LengthFixedVector description;

	
	public Base() {
		
		description=new LengthFixedVector(null, 0, 3);
		
	}
	
	public LengthFixedVector getVector() {
		return description;
	}
	
	public Point getEndpoint() {
		return description.getEndpoint();
	}

}
