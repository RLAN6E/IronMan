package basic_operators;

public class Plane {
	
	private Vector rV1;
	private Vector rV2;
	private Point base;

	public Plane() {

	}

	public Plane(double x1, double y1, double z1, double x2, double y2, double z2, double x3, double y3, double z3) {
		rV1= new Vector(null,x1,y1,z1,x1,y1,z1);
		rV2= new Vector(null,x1,y1,z1,x3,y3,z3);
		base= new Point(x1,y1,z1);
	}
	
	public Plane(Point p,Vector v1, Vector v2) {
		rV1=v1;
		rV2=v2;
		base=p;
	}
	
	

}
