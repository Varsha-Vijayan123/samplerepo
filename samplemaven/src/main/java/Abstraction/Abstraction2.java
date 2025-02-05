package Abstraction;

public class Abstraction2 extends Abstraction1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Abstraction2 obj1=new Abstraction2();//object creation
		Abstraction1 obj=new Abstraction2();//reference creation
		obj.display();
		obj.show();
		obj1.print();
	}
	public void print() {
		System.out.println("HELLO");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		
		
	}

}
