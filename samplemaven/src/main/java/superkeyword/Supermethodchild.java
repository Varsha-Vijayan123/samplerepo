package superkeyword;

public class Supermethodchild extends Supermethod {
	public void display1()
	{
		System.out.println("Child class");
		super.display();
	}

	public static void main(String[] args) {
		Supermethodchild obj=new Supermethodchild();
		obj.display1();
		// TODO Auto-generated method stub

	}

}
