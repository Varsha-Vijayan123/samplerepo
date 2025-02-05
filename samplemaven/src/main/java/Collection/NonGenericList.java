package Collection;

import java.util.ArrayList;
import java.util.List;

public class NonGenericList {

	public static void main(String[] args) {
		List s=new ArrayList();
		s.add("HELLO");
		s.add("a");
		s.add(5);
		s.add("a");
		System.out.println(s);
		s.set(0, "HAI");
		System.out.println(s);
		System.out.println(s.get(2));
		System.out.println(s.indexOf("a"));
		System.out.println(s.lastIndexOf("a"));
		s.remove(0);
		System.out.println(s);
		System.out.println(s.contains("HELLO"));
		
		// TODO Auto-generated method stub

	}

}
