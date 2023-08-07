//Elements stored should preserve the insertion order
package collection;

import java.util.ArrayList;
//import java.util.LinkedHashSet;

public class question7 {
	public static void main(String[] args)
	{
	ArrayList<String> ic =new ArrayList<>();
		addUniqueElement(ic,"twinkle");
		addUniqueElement(ic,"sita");
		addUniqueElement(ic,"ram");
		addUniqueElement(ic,"shyam");
		addUniqueElement(ic,"twinkle");
		addUniqueElement(ic,"twinkle");
		addUniqueElement(ic,"twinkle");
		addUniqueElement(ic,"twinkle");
		addUniqueElement(ic,"twinkle");
//		ic.add("gunjan");
//		ic.add("ayushi");
//		ic.add("sachin");
//		ic.add("adarsh");
//		ic.add("ayush");
//		ic.add("sajal");
//		ic.add("tinku");
//		ic.add("tinku");
//		ic.add("tinku");
//		ic.add("tinku");
//		ic.add("tinku");
//		ic.add("tinku");
System.out.println("String Collection:"+ic);
	}
	private static void addUniqueElement(ArrayList<String> list,String element)
	{
		if(!list.contains(element))
		{
			list.add(element);
		}
}
		}
	