package inheritance; 

public class MultilevelChild extends MultilevelParentB{
	public void display2()
	{
		System.out.println("Childclass");
	}

	public static void main(String[] args) {
		MultilevelChild obj=new MultilevelChild();
		obj.display();
		obj.display1();
		obj.display2();
	}

}
