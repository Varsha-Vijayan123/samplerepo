package Aggregation;

public class Studentdetails2 {
	String address;
	Studentdetails1 ref;
	public Studentdetails2(String address,Studentdetails1 ref) {
		this.address=address;
		this.ref=ref;
	}
	public void display()
	{
		System.out.println(address);
		System.out.println(ref.name + " " + ref.rollno );
	}

	public static void main(String[] args) {
		Studentdetails1 obj=new Studentdetails1("Varsha", 10 );
		Studentdetails2 obj1=new Studentdetails2("Sreeragam",obj);
		obj1.display();
		

	}

}
