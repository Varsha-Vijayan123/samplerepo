package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteratoreg1 {

	public static void main(String[] args) {
		ArrayList<String> s=new ArrayList<String>();
		s.add("Black");
		s.add("Blue");
		s.add("Purple");
		s.add("Orange");
		s.add("Red");
		Iterator it=s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		// TODO Auto-generated method stub

	}

}
