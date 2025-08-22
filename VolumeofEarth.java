public class VolumeofEarth {
	public static void main(String[] args){
	double radiusOfEarthInKM = 6378;
	double radiusOfEarthInMiles = 0.62*radiusOfEarthInKM;
	
	double volumeOfEarth = (4.0/3.0)*Math.PI*Math.pow(radiusOfEarthInKM, 3);
	double volumeOfEarthInMiles = (4.0/3.0)*Math.PI*Math.pow(radiusOfEarthInMiles, 3);
	System.out.println("Volume of Earth in KM^3:  "+volumeOfEarth);
	System.out.println("Volume of Earth in miles^3:  "+volumeOfEarthInMiles);
	
	}
}