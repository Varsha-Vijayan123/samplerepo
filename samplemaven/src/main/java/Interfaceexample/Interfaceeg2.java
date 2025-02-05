package Interfaceexample;

public class Interfaceeg2 implements Interfaceeg1 {

	public static void main(String[] args) {
		Interfaceeg2 obj1=new Interfaceeg2();//object creation
		Interfaceeg1 obj=new Interfaceeg2();//reference creation
		obj.display();
		obj1.show();
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		System.out.println("Varsha");			
		}
		public void show()
		{
			System.out.println("Hai");
		
	}

}
