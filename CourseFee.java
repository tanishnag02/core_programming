public class CourseFee {
	public static void main(String[] args){
		int collegeFee = 125000;
		int discountPercent = 10;
		int discount = collegeFee*discountPercent/100;
		int finalAmount = collegeFee - discount;
		System.out.println(" The discount amount is INR" + discount +
		" and Final discounted fee is INR "+finalAmount);
	}
	
}