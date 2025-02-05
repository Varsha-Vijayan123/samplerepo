package accessmodifiers;

public class Accessmodifierexample1 {
	public void display()
	{
		System.out.println("Hai");
	}
	private void display1()
	{
		System.out.println("Hello");
	}
	protected void display2()
	{
		System.out.println("My name is Varsha");
	}
	void display3()
	{
		System.out.println("Age is 24");
	}

	public static void main(String[] args) {
		Accessmodifierexample1 obj=new Accessmodifierexample1();
				obj.display();
		obj.display1();
		obj.display2();
		obj.display3();
	

	}

}
