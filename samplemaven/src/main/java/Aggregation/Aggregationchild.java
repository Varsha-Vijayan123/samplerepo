package Aggregation;

public class Aggregationchild {
	String subject;
	int marks;
	AggregationParent ref;
	public Aggregationchild(String subject,int marks,AggregationParent ref) {
		this.subject=subject;
		this.marks=marks;
		this.ref=ref;
	}
	public void display()
	{
		System.out.println(subject + " " + marks);
		System.out.println(ref.StudId + " " + ref.Rollno);
	}

	public static void main(String[] args) {
		AggregationParent obj=new AggregationParent(12345,5);
		Aggregationchild obj1=new Aggregationchild("English",50,obj);
		obj1.display();
	}

}