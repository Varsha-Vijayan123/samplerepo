package Aggregation;

public class Aggregation2 {
	String city;
	String state;
	Aggregation1 ref;//Aggregation
	public Aggregation2(String city,String state,Aggregation1 ref)
	{
		this.city=city;
		this.state=state;
		this.ref=ref;
	}
	public void display()
	{
		System.out.println(city + " " + state);
		System.out.println(ref.name +" "+ ref.rollno);
	}

	public static void main(String[] args) {
		Aggregation1 obj=new Aggregation1("Varsha",10,"Sreeragam");
		Aggregation2 obj1=new Aggregation2("Tvm","Kerala",obj);
		obj1.display();
		// TODO Auto-generated method stub

	}

}
