package parts_Arm;

import basic_operators.*;

public class Arm {
	LengthFixedVector upperArm;
	LengthFixedVector foreArm;
	LengthFixedVector hand;

	double upperArmLength;
	double foreArmLength;
	double handLenght;
	double span;

	public Arm(double uAl, double fAl, double hl) {

		upperArm= new LengthFixedVector(null,uAl,2);
		
		foreArm= new LengthFixedVector(upperArm,fAl,2);
		
		hand= new LengthFixedVector(foreArm,hl,2);
	}

	// get parts of the arm

	public LengthFixedVector getUpperArm() {
		return upperArm;
	}

	public LengthFixedVector getForeArm() {
		return foreArm;
	}

	public LengthFixedVector getHand() {
		return hand;
	}

}
