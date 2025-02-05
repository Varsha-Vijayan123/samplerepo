package Collection;

import java.util.ArrayList;
import java.util.List;

public class GenericList {

	public static void main(String[] args) {
		List<String> s=new ArrayList <String>();
		s.add("RED");
		s.add("YELLOW");
		s.add("BLACK");
		s.add("BLUE");
		s.add("GREEN");
		s.add("WHITE");
		s.add("BLUE");
		System.out.println(s);
		s.set(2, "VIOLET");
		System.out.println(s);
		System.out.println(s.get(3));
		System.out.println(s.indexOf("BLUE"));
		System.out.println(s.lastIndexOf("BLUE"));
		s.remove(4);
		System.out.println(s);
		System.out.println(s.contains("YELLOW"));

	}

}
