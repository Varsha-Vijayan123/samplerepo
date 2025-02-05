package Interfaceexample;

public class MultipleChild implements MultipleA,MultipleB {

	public static void main(String[] args) {
		MultipleChild obj=new MultipleChild();
		obj.print();
		obj.show();
		// TODO Auto-generated method stub
	}

	@Override
	public void show() {
		System.out.println("Chinnu");
		// TODO Auto-generated method stub
	}

	@Override
	public void print() {
		System.out.println("haiiii");
		// TODO Auto-generated method stub
	}

}
