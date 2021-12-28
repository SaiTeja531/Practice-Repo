package AmazonFramework;

import java.util.HashMap;
import java.util.HashSet;

interface interf{
	public void m1();
}

class Demo{
	interf i = () -> System.out.println("Mommy");
}

public class Java8Practice{

	public static void main(String[] args) {
//		interf i = () -> System.out.println("Mommy");
//		i.m1();
//		Demo d = new Demo();
//		d.i.m1();
		HashMap<Integer, String> map1 = new HashMap<>();
		map1.put(1, "sake");
		map1.put(2, "sadi");
		map1.put(3, "sadineni");
		HashMap<Integer, String> map2 = new HashMap<>();
		map2.put(3, "sadineni");
		map2.put(1, "sake");
		map2.put(2, "sadi");
		map2.put(4, "Baby");
		System.out.println(map1.equals(map2));
		HashSet<Integer> com = new HashSet<>(map2.keySet());
		com.removeAll(map1.keySet());
		System.out.println(com);
		System.out.println("sakesh sadineni");
		

	}
	

}
