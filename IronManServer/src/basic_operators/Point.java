package basic_operators;

public class Point {

	double[] coords;
	int dimension;

	public Point(double... aCoords) {
		coords = aCoords;
		dimension=coords.length;
	}

	public Point(int dim) {
		coords = new double[dim];
		dimension=dim;
		for (double d : coords) {
			d = 0;
		}
	}
	

	// GETTER

	public double getCorrd(int pos) {
		if (pos <= coords.length) {
			return coords[pos];
		} else {
			return 0;
		}
	}
	
	public int getDimension() {
		return dimension;
	}

	public void setCoord(int pos, double value) {
		coords[pos] = value;
	}
	
	//GENERAL
	
	public String toString() {
		String retVal= "";
		for(int i=0;i<dimension;i++) {
			retVal = retVal+"d<" + i + ">("+coords[i]+")  ";
		}
		return retVal;
	}
}
