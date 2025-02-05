package polymorphism;

public class Offseason extends Onseason {
	public void discountOffseason(double amount) {
		System.out.println("Offseason price after 15% discount:" + (amount * 0.85 ));
				
	}

	public static void main(String[] args) {
		double amount=5000;
		Onseason obj=new Onseason();
		Offseason obj1=new Offseason();
		obj1.discountOffseason(amount);
		obj.discountOnseason(amount);

	}
}
