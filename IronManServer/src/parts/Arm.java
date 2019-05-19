package parts;

import basic_operators.Point;

public class Arm extends Part{
	private UpperArm upperArm;
	private ForeArm foreArm;
	private Hand hand;
	

	double upperArmLength;
	double foreArmLength;
	double handLenght;
	double span;

	public Arm(double uAl, double fAl, double hl) {

		upperArm= new UpperArm(uAl,null,2);
		
		foreArm= new ForeArm(fAl,upperArm.getVector(),2);
		
		hand= new Hand(hl,foreArm.getVector(),2);
	}

	// get parts of the arm

	public UpperArm getUpperArm() {
		return upperArm;
	}

	public ForeArm getForeArm() {
		return foreArm;
	}

	public Hand getHand() {
		return hand;
	}
	
	

}
