package parts;


public class Arm{
	
	private Base base;
	
	private UpperArm upperArm;
	private ForeArm foreArm;
	private Hand hand;
	
	private HingeJoint elbow;
	private HingeJoint shoulder;
	private HingeJoint wrist;
	

	double upperArmLength;
	double foreArmLength;
	double handLenght;
	double span;
	
	


	public Arm(double uAl, double fAl, double hl) {

		upperArm= new UpperArm(uAl,null,3);
		foreArm= new ForeArm(fAl,upperArm.getVector().getEndpoint(),3);
		hand= new Hand(hl,foreArm.getVector().getEndpoint(),3);
		
		shoulder= new HingeJoint(base,upperArm);
		elbow= new HingeJoint(upperArm, foreArm);
		wrist= new HingeJoint(foreArm,hand);
		
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
	
	public HingeJoint getShoulder() {
		return shoulder;
	}
	
	public HingeJoint getElbow() {
		return elbow;
	}
	
	public HingeJoint getWrist() {
		return wrist;
	}
	

}
