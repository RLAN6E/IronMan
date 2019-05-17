package parts_Arm;

import basic_operators.*;

public class ForeArm implements ArmPart{
	
	private LengthFixedVector descriptionVector;
	private Vector base;
	private double length;
	
	public ForeArm(double length,ArmPart base) {
		descriptionVector= new LengthFixedVector(base.getVector(),length,2);
	}
	

	@Override
	public double getLength() {
		return length;
		
	}

	@Override
	public LengthFixedVector getVector() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
