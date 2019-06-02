package parts;

import basic_operators.Point;
import basic_operators.Point_operator;
import basic_operators.Vector;
import basic_operators.Vector_operator;

public final class Arm_Operators {

	Point_operator pO;
	Vector_operator vO;

	public Arm_Operators() {
		pO = new Point_operator();
		vO= new Vector_operator();
	}

	public void goToTwoArmed(Point pEnd, ArmPart a1, ArmPart a2) {

		Point basePoint = a1.getEndpoint();
		Point endPoint = pEnd;
		
		double distance=pO.distance(basePoint, endPoint);
		double lengthV1= a1.getLength();
		double lengthV2= a2.getLength();
		
		Point currentEndV1= a1.getEndpoint();
		

		if (distance >lengthV1 +lengthV2
				|| distance < lengthV1 -lengthV2) {
			throw new RuntimeException("2");
		} else {
			double ratio= Math.sqrt(Math.pow(a1.getLength(), 2)+Math.pow(a2.getLength(), 2));
			double lengthD1= distance/(ratio+1);
			double lengthD2= distance-lengthD1;
			double lengthO= Math.sqrt(Math.pow(lengthV1, 2)-Math.pow(lengthD1, 2));
			
			Vector d1= vO.multiply(new Vector(basePoint,basePoint,endPoint), ratio);
			
			
			
			
		}

	}

}
