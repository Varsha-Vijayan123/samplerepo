package inheritance;

public class ChildClass extends SingleParent
	{
	public static void main(String[] args) {
		ChildClass obj=new ChildClass();
				obj.display();
				obj.display1();
}
public void display1()
{
	System.out.println("Childclass");
}
}
