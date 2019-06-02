package parts;

import basic_operators.*;

public class HingeJoint {

	private Vector_operator vO;

	private double angle;
	ArmPart arm1;
	ArmPart arm2;

	public HingeJoint(ArmPart a1, ArmPart a2) {
		arm1 = a1;
		arm2 = a2;

		vO = new Vector_operator();
	}

	public double getAngle() {
		return angle;
	}

	public double calculateAngle() {
		try {
			return vO.angle(arm1.getVector(), arm2.getVector());
		} catch (NullPointerException e) {
			return 0.0;
		}
	}

	public void setAngle(double aA) {
		angle = aA;
	}
	
	

}
