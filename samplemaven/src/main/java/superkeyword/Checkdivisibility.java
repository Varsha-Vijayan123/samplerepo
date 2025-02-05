package superkeyword;

public class Checkdivisibility extends Addition {
	public void Divisibileby10()
	{
		int result=super.add(50,50);
		System.out.println("The addition result is: " + result);
		if(result % 10 == 0) {
			System.out.println("The addition result is divisible by 10");
		}
		else
		{
			System.out.println("The addition result is not divisible by 10");
		}
	}

	public static void main(String[] args) {
	Checkdivisibility obj= new Checkdivisibility();
	obj.Divisibileby10();
		// TODO Auto-generated method stub

	}

} 