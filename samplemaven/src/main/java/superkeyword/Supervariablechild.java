package superkeyword;

public class Supervariablechild extends Supervariable {
	String color="Red";
	public void display()
	{
		System.out.println(color);
		System.out.println(super.color);
	}

	public static void main(String[] args) {
		Supervariablechild obj=new Supervariablechild();
		obj.display();
		// TODO Auto-generated method stub

	}

}
