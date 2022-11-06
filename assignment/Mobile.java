package assignment;

public class Mobile {

	String mobileBrandName = "Nokia";
	char mobileLogo = 'N';
	short noOfMobilePiece = 10000;
	int modelNumber = 3626;
	long mobileImeiNumber = 1234567890L;
	float mobilePrice = 7500.5000F;
	double mobileDiscount = 12.55;
	boolean isDamaged = true;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile mob = new Mobile();
		mob.printAllData();

	}
	
	public void printAllData() {
		System.out.println(mobileBrandName);
		System.out.println(mobileLogo);
		System.out.println(noOfMobilePiece);
		System.out.println(modelNumber);
		System.out.println(mobileImeiNumber);
		System.out.println(mobilePrice);
		System.out.println(mobileDiscount);
		System.out.println(isDamaged);
	}

}
