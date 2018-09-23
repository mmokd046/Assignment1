
public interface coordinateComputation {

	// Name all the methods that are used differently by each class 
	public double getX();
	public double getY();
	public double getRho();
	public double getTheta();
	public coordinateComputation convertStorageToCartesian();
	public coordinateComputation convertStorageToPolar();
	public double getDistance(coordinateComputation pointB);
	public coordinateComputation rotatePoint(double rotation);
	public String toString();	
}
