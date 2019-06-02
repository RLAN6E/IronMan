package basic_operators;

public final class Point_operator{

	public Point_operator() {
		
	}
	
	public double distance(Point p1,Point p2) {
		double dX= p1.getCorrd(0)-p2.getCorrd(0);
		double dY= p1.getCorrd(1)-p2.getCorrd(1);
		double dZ= p1.getCorrd(2)-p2.getCorrd(2);
		
		return Math.sqrt(Math.pow(dX, 2)+Math.pow(dY, 2)+Math.pow(dZ, 2));
	}
}
