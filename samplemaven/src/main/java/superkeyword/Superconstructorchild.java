package superkeyword;

public class Superconstructorchild extends Superconstructor {
	public Superconstructorchild()
	{
		super(10,20);
		System.out.println("Child class");
	}

	public static void main(String[] args) {
		Superconstructorchild obj=new Superconstructorchild();
		// TODO Auto-generated method stub

	}

}
