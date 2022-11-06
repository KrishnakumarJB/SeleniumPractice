package assignment;

public class TwoWheeler {
	
	int noOfWheels = 4;
	short noOfMirrors = 2;
	long chassisNumber = 100012121212121212L;
	boolean isPunctured = false;
	String bikeName = "Honda";
	double runningKM = 100.25;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoWheeler twoWheeler = new TwoWheeler();
		twoWheeler.printAllData();

	}
	
	public void printAllData() {
		System.out.println(noOfWheels);
		System.out.println(noOfMirrors);
		System.out.println(chassisNumber);
		System.out.println(isPunctured);
		System.out.println(bikeName);
		System.out.println(runningKM);
	}

}
