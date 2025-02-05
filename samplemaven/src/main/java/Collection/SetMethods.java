package Collection;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {

	public static void main(String[] args) {
		Set<String> s=new HashSet<String>();
		s.add("Red");
		s.add("Violet");
		s.add("Black");
		System.out.println(s);
		Set<String> s1=new HashSet<String>();
		s1.add("White");
		s1.add("Blue");
		s.addAll(s1);
		System.out.println(s);
		System.out.println(s.contains("Red"));
		System.out.println(s.containsAll(s1));
		System.out.println(s.isEmpty());
		s.remove("Violet");
		System.out.println(s);
		s.removeAll(s1);
		System.out.println(s);
		System.out.println(s.size());

	}
}
